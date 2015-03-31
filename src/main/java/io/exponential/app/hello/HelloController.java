package io.exponential.app.hello;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/xxx", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
