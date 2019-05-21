package za.ac.cput.Cricket.domain.recess;

public class Drink {
    private String time;
    private String drinkId;

    private Drink(){}



    private Drink(Builder builder)
    {
        this.time = builder.time;
        this.drinkId = builder.drinkId;

    }
    public String getTime() {
        return time;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public static class Builder
    {
        private String time;
        private String drinkId;

        public Builder time(String time)
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
