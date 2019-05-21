package za.ac.cput.Cricket.domain.records;

public class Overs {
    private int delivery;
    private int maxOvers;

    private Overs(){}

    public int getDelivery() {
        return delivery;
    }

    public int getMaxOvers() {
        return maxOvers;
    }

    private Overs(Builder builder)
    {
        this.delivery = builder.delivery;
        this.maxOvers = builder.maxOvers;

    }
    public static class Builder
    {
        private int delivery,maxOvers;

        public Builder delivery(int delivery)
        {
            this.delivery = delivery;
            return this;
        }

        public Builder maxOvers(int maxOvers)
        {
            this.maxOvers = maxOvers;
            return this;
        }

        public Overs build()
        {
            return new Overs(this);
        }
    }


}



