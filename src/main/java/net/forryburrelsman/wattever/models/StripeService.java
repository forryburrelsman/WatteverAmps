package net.forryburrelsman.wattever.models;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import net.forryburrelsman.wattever.data.ChargeRequest;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.naming.AuthenticationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {

//    @Value("${STRIPE_SECRET_KEY}")
//    private String secretKey = "";

//    @PostConstruct
//    public void init() {
//        Stripe.apiKey = secretKey;
//    }
//    public <APIConnectionException extends Throwable, APIException extends Throwable> Charge charge(ChargeRequest chargeRequest)
//            throws AuthenticationException, StripeException,
//            APIConnectionException, APIException {
//        Map<String, Object> chargeParams = new HashMap<>();
//        chargeParams.put("amount", chargeRequest.getAmount());
//        chargeParams.put("currency", chargeRequest.getCurrency());
//        chargeParams.put("description", chargeRequest.getDescription());
//        chargeParams.put("source", chargeRequest.getStripeToken());
//        return Charge.create(chargeParams);
//    }
public void displayPaymentMethods() {
    ArrayList paymentMethodTypes = new ArrayList();
    paymentMethodTypes.add("card");

    Map<String, Object> params = new HashMap<>();
    params.put("payment_method_types", paymentMethodTypes);
    params.put("amount", 1000);
    params.put("currency", "usd");
    params.put("application_fee_amount", 123);

//    RequestOptions requestOptions = RequestOptions.builder().setStripeAccount({{CONNECTED_STRIPE_ACCOUNT_ID}}).build();
//    PaymentIntent paymentIntent = PaymentIntent.create(params, requestOptions);
}
}
