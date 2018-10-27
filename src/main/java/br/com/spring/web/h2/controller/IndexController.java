package br.com.spring.web.h2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("uname", System.getenv("UNAME"));
        model.addAttribute("now", new SimpleDateFormat("dd/MM/YYYY hh:mm:ss").format(Calendar.getInstance().getTime()));

        try {
            model.addAttribute("localhost", InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "index";
    }

}
