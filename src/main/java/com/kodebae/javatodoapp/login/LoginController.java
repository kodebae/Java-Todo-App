package com.kodebae.javatodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    @RequestMapping("login")
    public String goToLoginPage() {
        return "login from JSP";
    }
}

// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
// src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp