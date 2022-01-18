package net.wattever.models;

import com.stripe.Stripe;
import com.stripe.exception.CardException;
import com.stripe.exception.StripeException;
import com.stripe.exception.oauth.InvalidRequestException;
import com.stripe.model.Charge;
import net.wattever.data.ChargeRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.naming.AuthenticationException;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {

//    @Value("${STRIPE_SECRET_KEY}")
    private String secretKey = "";

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }
    public <APIConnectionException extends Throwable, APIException extends Throwable> Charge charge(ChargeRequest chargeRequest)
            throws AuthenticationException, StripeException,
            APIConnectionException, APIException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", chargeRequest.getAmount());
        chargeParams.put("currency", chargeRequest.getCurrency());
        chargeParams.put("description", chargeRequest.getDescription());
        chargeParams.put("source", chargeRequest.getStripeToken());
        return Charge.create(chargeParams);
    }
}
