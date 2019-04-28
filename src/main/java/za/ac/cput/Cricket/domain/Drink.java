package za.ac.cput.Cricket.domain;

public class Drink {
    private int time;

    private Drink(){}



    private Drink(Builder builder)
    {
        this.time = builder.time;

    }
    public int getTime() {
        return time;
    }
    public static class Builder
    {
        private int time;

        public Builder time(int name)
        {
            this.time = time;
            return this;
        }



        public Drink build()
        {
            return new Drink(this);
        }
    }

    @Override
    public String toString() {
        return "Drink{" +
                "time=" + time +
                '}';
    }
}
