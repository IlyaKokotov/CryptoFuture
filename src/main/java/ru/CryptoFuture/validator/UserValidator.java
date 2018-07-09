package ru.CryptoFuture.validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.CryptoFuture.model.User;
import ru.CryptoFuture.service.UserService;


@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    /**
     * Здесь данные с формы проверяются на корректность
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {

        User validateUser = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");
        if(validateUser.getUsername().length() < 8 || validateUser.getUsername().length() > 32) {

            errors.rejectValue("username", "Size.userForm.username");

        }

        if(userService.findByUsername(validateUser.getUsername()) != null) {

            errors.rejectValue("username", "Duplicate.userForm.username");

        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");
        if(validateUser.getPassword().length() < 8 || validateUser.getPassword().length() > 32) {

            errors.rejectValue("password", "Size.userForm.password");

        }

        if(!validateUser.getConfirmPassword().equals(validateUser.getPassword())) {
            errors.rejectValue("confirmPassword", "Different.userForm.password");
        }
    }
}
