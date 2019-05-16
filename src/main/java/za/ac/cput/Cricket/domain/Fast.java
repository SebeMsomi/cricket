package za.ac.cput.Cricket.domain;

import java.security.KeyStore;

public class Fast {
    private double mph;


    private Fast(){}

    private Fast(Builder builder) {
        this.mph = builder.mph;
    }

    public double getMph() {
        return mph;
    }

    public static class Builder{
            private double mph;
        public Builder mph(double mph) {
            this.mph = mph;
            return this;
        }
        public Fast build() {
            return new Fast(this);
        }
    }

    @Override
    public String toString() {
        return "Fast{" +
                "mph=" + mph +
                '}';
    }
}
