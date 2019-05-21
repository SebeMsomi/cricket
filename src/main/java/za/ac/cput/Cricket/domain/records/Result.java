package za.ac.cput.Cricket.domain.records;

public class Result {
    private int ress;
    private int wicket;

    private Result(){}

    private Result(Builder builder)
    {
        this.ress = builder.ress;
        this.wicket = builder.wicket;

    }

    public int getRess() {
        return ress;
    }

    public int getWicket() {
        return wicket;
    }

    public static class Builder
    {
        private int wicket,ress;

        public Builder wicket(int wicket)
        {
            this.wicket = wicket;
            return this;
        }

        public Builder ress(int ress)
        {
            this.ress = ress;
            return this;
        }

        public Result build()
        {
            return new Result(this);
        }
    }
}
