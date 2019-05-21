package za.ac.cput.Cricket.domain.records;

public class Fast {
    private String mph;


    private Fast(){}

    private Fast(Builder builder) {
        this.mph = builder.mph;
    }

    public String getMph() {
        return mph;
    }

    public static class Builder{
            private String mph;
        public Builder mph(String mph) {
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
