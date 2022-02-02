package net.forryburrelsman.wattever.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StripeController {

    @GetMapping("/checkout")
    public String stripeHome(Model model) {
        return "checkout";
    }
}
