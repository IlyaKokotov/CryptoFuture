package ru.CryptoFuture.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.CryptoFuture.model.RestPostsModel;
import ru.CryptoFuture.model.RestUserModel;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    private final String EXTERNAL_REST_URL = "http://jsonplaceholder.typicode.com";

    /**
     * Получает всех пользователей
     * @return
     */
    @RequestMapping(value = "/rest/users", method = RequestMethod.GET)
    public List<RestUserModel> getRestUsers() {
        System.out.println("RestTemplateController getRestUsers is called");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:49.0) Gecko/20100101 Firefox/49.0");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        //JSON http://jsonplaceholder.typicode.com/users
        ResponseEntity<RestUserModel[]> response = restTemplate.exchange(
                EXTERNAL_REST_URL + "/users",
                HttpMethod.GET,
                entity,
                RestUserModel[].class
        );
        return Arrays.asList(response.getBody());
    }

    /**
     * @return Получает все посты
     */
    @RequestMapping(value = "/rest/posts", method = RequestMethod.GET)
    public List<RestPostsModel> getRestPosts() {
        System.out.println("RestTemplateController getRestPosts is called");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:49.0) Gecko/20100101 Firefox/49.0");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<RestPostsModel[]> response = restTemplate.exchange(
                EXTERNAL_REST_URL + "/posts",
                HttpMethod.GET,
                entity,
                RestPostsModel[].class
        );
        return Arrays.asList(response.getBody());
    }

    /**
     * @param param
     * @return Получить тело поста по id
     */
    @RequestMapping(value = "/rest/posts/{param}", method = RequestMethod.GET)
    public RestPostsModel getRestPostsById(@PathVariable("param") String param) {
        System.out.println("RestTemplateController getRestPostsById is called");

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:49.0) Gecko/20100101 Firefox/49.0");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<RestPostsModel> response = restTemplate.exchange(
                EXTERNAL_REST_URL + "/posts/" + param,
                HttpMethod.GET,
                entity,
                RestPostsModel.class
        );
        return response.getBody();
    }

    /**
     * @param postId Удаляет пост по id
     */
    @RequestMapping(value = "/rest/delPosts/{postId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void deletePostByID(@PathVariable(value = "postId") String postId) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:49.0) Gecko/20100101 Firefox/49.0");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);


        restTemplate.exchange(EXTERNAL_REST_URL + "/posts/" + postId, HttpMethod.DELETE, entity, String.class);
        System.out.println("@RestTemplateControllerExample deletePostByID is called");
    }

    /**
     * @param ex Обрабатывает исключения, возникшие в @RestTemplateController
     */
    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "FORBIDDEN ACCESS (PROVIDE YOUR CUSTOM REASON HERE)")
    public void handleException(Exception ex) {
        System.out.println("@RestTemplateControllerExample handleException");
        System.out.println(ex);
    }
}