package net.forryburrelsman.wattever.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("connection")
public class ConnectionController {

    public static HashMap<String, String> subscribers = new HashMap<>();

    @GetMapping
    public String connectionPage(){
        return "connection";
    }



    //display email sign-up form
//    @GetMapping
//    public void emailSignUpForm(@RequestParam String name, @RequestParam String email) {
//        subscribers.put(name, email);
//    }
//
//    @PostMapping
//    public String processEmailSignupForm() {
//
//        return "redirect";
//    }


}
