package net.wattever.data;


public class ChargeRequest {

        public enum Currency {
            EUR, USD;
        }
        private String description;
        private int amount;
        private Currency currency;
        private String stripeEmail;
        private String stripeToken;

        public void setDescription(String description) {
                this.description = description;
        }

        public void setCurrency(Currency currency) {
                this.currency = currency;
        }

        public String getDescription() {
                return description;
        }

        public Currency getCurrency() {
                return currency;
        }

        public int getAmount() {
                return amount;
        }

        public String getStripeToken() {
                return stripeToken;
        }
}

