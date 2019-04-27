package za.ac.cput.Cricket.domain;

public class Lunch {
    private int time;

    private Lunch(){}



    private Lunch(Builder builder)
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



        public Lunch build()
        {
            return new Lunch(this);
        }
    }

}
