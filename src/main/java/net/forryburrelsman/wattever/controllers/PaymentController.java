package net.forryburrelsman.wattever.controllers;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import net.forryburrelsman.wattever.dto.CreatePayment;
import net.forryburrelsman.wattever.dto.CreatePaymentResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public CreatePaymentResponse cratePaymentIntent(@RequestBody CreatePayment createPayment) throws StripeException {
            //CreatePayment postBody = gson.fromJson(request.body(), CreatePayment.class);
            PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                    .setAmount(15 * 100L)// createPayment..what product does user want to buy.. how much does item cost
                    .setCurrency("usd")
                    .build();
            // Create a PaymentIntent with the order amount and currency
            PaymentIntent paymentIntent = PaymentIntent.create(createParams);
            return new CreatePaymentResponse(paymentIntent.getClientSecret());
        }

    public void displayPaymentMethods(){

        ArrayList<String> paymentMethodTypes = new ArrayList<>();
        paymentMethodTypes.add("card");

        System.out.print(paymentMethodTypes);
    }
    }

