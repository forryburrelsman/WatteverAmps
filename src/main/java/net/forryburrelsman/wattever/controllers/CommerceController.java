package net.forryburrelsman.wattever.controllers;

import com.stripe.Stripe;
import com.stripe.param.billingportal.SessionCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;

@RestController
@RequestMapping
public class CommerceController {

    @GetMapping("commerce")
    public String commercePage(){
        return "commerce";
    }


    @Value("${stripe.apikey}")
    private String stripePublicKey;

    @GetMapping("stripe")
    public String checkout(Model model){
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        //model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "hello " + stripePublicKey;
    }

//    staticFiles.externalLocation(
//            Paths.get("public").toAbsolutePath().toString());


}
