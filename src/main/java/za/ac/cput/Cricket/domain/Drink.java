package za.ac.cput.Cricket.domain;

public class Drink {
    private int time;
    private String drinkId;

    private Drink(){}



    private Drink(Builder builder)
    {
        this.time = builder.time;
        this.drinkId = builder.drinkId;

    }
    public int getTime() {
        return time;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public static class Builder
    {
        private int time;
        private String drinkId;

        public Builder time(int time)
        {
            this.time = time;
            return this;
        }

        public Builder drinkId(String drinkId)
        {
            this.drinkId = drinkId;
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
                ", drinkId='" + drinkId + '\'' +
                '}';
    }
}
