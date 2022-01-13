package net.wattever.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CommerceController {

    @GetMapping("collection")
    public String collectionPage(){
        return "collection";
    }

    @GetMapping("commerce")
    public String commercePage(){
        return "commerce";
    }

}