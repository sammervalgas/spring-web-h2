package br.com.spring.web.h2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<center><h1>Hello " + System.getenv("UNAME") + "</h1></center>";
    }

}
