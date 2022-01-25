//package net.wattever.controllers;
//
//import com.stripe.param.PaymentIntentCreateParams;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PaymentController {
//
//    @PostMapping("/create-payment-intent")
//    public void cratePaymentIntent(){

//            CreatePayment postBody = gson.fromJson(request.body(), CreatePayment.class);
//            PaymentIntentCreateParams params =
//                    PaymentIntentCreateParams.builder()
//                            .setAmount(new Long(calculateOrderAmount(postBody.getItems())))
//                            .setCurrency("eur")
//                            .setAutomaticPaymentMethods(
//                                    PaymentIntentCreateParams.AutomaticPaymentMethods
//                                            .builder()
//                                            .setEnabled(true)
//                                            .build()
//                            )
//                            .build();
//
//            // Create a PaymentIntent with the order amount and currency
//            PaymentIntent paymentIntent = PaymentIntent.create(params);
//
//            CreatePaymentResponse paymentResponse = new CreatePaymentResponse(paymentIntent.getClientSecret());
//            return gson.toJson(paymentResponse);
//        });
//    }
//
//}
