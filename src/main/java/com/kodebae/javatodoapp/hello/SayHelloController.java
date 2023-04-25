package com.kodebae.javatodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // get a response from
    @RequestMapping("say-hello") // http://localhost8080/say-hello
    @ResponseBody// map a URL to this method
    public String sayHello() {
        return "Hello World!";
    }
    @RequestMapping("say-hello-html") // http://localhost8080/say-hello
    @ResponseBody// map a URL to this method
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
            sb.append("<html>");
            sb.append("<body>");
            sb.append("Saying hello with HTML");
            sb.append("</body>");
            sb.append("</html>");
        return sb.toString();
    }
}
