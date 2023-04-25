package com.kodebae.javatodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // get a response from
    @RequestMapping("say-hello")
    @ResponseBody// map a URL to this method
    public String sayHello() {
        return "Hello Panda, I love you!";
    }

}
