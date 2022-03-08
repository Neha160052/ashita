package com.restwebservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld(){
        return "Welcome to spring boot";
    }

    @GetMapping(path = "/hello-world-bean")
    public helloWorldBean helloWorldBean(){
        return new helloWorldBean("Welcome to spring boot");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public helloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new helloWorldBean(String.format("Hello, %s", name));
    }

    @GetMapping(path="/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale ){
        return messageSource.getMessage("good.morning.message", null, locale);
    }
}
