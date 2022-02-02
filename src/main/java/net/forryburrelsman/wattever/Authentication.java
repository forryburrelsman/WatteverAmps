package net.forryburrelsman.wattever;

import com.stripe.Stripe;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.param.CustomerListParams;

public class Authentication {
    public static void main(String[] args){
        try {
            Stripe.apiKey = "sk_test_51HqvI4B9GwBN1q0xE3mQDY1gwTzCruGXhQtZZul4qH0yP7OT1dI06uZigQj1tBbnPuwFgOxMlEucExNW58hQJZIU00OU5IerKG";
            CustomerListParams params = CustomerListParams.builder().build();
            CustomerCollection customers = Customer.list(params);
            System.out.println(customers);
        } catch(Exception e) {
            System.out.println(e);

        }

    }
}
