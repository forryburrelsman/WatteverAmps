package net.wattever.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class NavigationController {

    @GetMapping("creation")
    public String creation() {return "creation";}

    @GetMapping
    public String homePage() {
        return "home";
    }

    @GetMapping("collection")
    public String collectionPage(){
        return "collection";
    }

}
