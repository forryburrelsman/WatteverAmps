package net.forryburrelsman.wattever.dto;

public class CreatePaymentResponse {
    private String clientSecret;
    public CreatePaymentResponse(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
