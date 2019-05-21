package za.ac.cput.Cricket.domain;

public class Lunch {
    private String time;

    private Lunch(){}



    private Lunch(Builder builder)
    {
        this.time = builder.time;

    }
    public String getTime() {
        return time;
    }
    public static class Builder
    {
        private String time;

        public Builder time(String time)
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
