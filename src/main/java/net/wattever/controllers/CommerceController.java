package net.wattever.controllers;

import com.stripe.Stripe;
import com.stripe.param.billingportal.SessionCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Paths;

@Controller
@RequestMapping
public class CommerceController {

    @GetMapping("commerce")
    public String commercePage(){
        return "commerce";
    }



//    @Value("${STRIPE_PUBLIC_KEY}")
    private String stripePublicKey = "";

    @GetMapping("check-out")
    public String checkout(Model model){
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripePublicKey", stripePublicKey);
        //model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "check-out";
    }

//    staticFiles.externalLocation(
//            Paths.get("public").toAbsolutePath().toString());


}
