package ru.CryptoFuture.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.CryptoFuture.model.User;
import ru.CryptoFuture.service.SecurityService;
import ru.CryptoFuture.service.UserService;
import ru.CryptoFuture.validator.UserValidator;


@Controller
public class UserController  {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    /**
     * Возвращает страницу с регистрацией
     * @param model
     * @return
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {

        model.addAttribute("userForm", new User());
        return "registration";

    }

    /**
     * При успешном вводе данных возвращает главную страницу,
     * если данные не проходят валидацию, врзвращает страницу с регистрацией
     * @param userForm
     * @param bindingResult
     * @param model
     * @return
     */
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if(bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());
        return "redirect:/welcome";

    }

    /**
     * Возвращает страницу логина
     * @param model
     * @param error
     * @param logout
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if(error != null) {
            model.addAttribute("error", "Username or password is incorrect");
        }

        if(logout != null) {
            model.addAttribute("message", "Logged out successfully");

        }

        return "login";

    }

    /**
     * Возвращает главную
     * @param model
     * @return
     */
    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome (Model model) {
        return "welcome";
    }

    /**
     * Страница, которую видит только админ
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }

}
