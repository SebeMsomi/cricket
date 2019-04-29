package za.ac.cput.Cricket.domain;

import java.util.Objects;

public class Batsman {
    private int runScored;
    private int ratings;

    private Batsman(){}

    private Batsman (Builder builder)
    {
        this.ratings = builder.ratings;
        this.runScored = builder.runScored;
    }

    public int getRunScored() {
        return runScored;
    }

    public int getRatings() {
        return ratings;
    }

    public static class Builder{
        private int ratings,runScored;

        public Builder runScored(int runScored) {
            this.runScored = runScored;
            return this;
        }

        public Builder ratings(int ratings) {
            this.ratings = ratings;
            return this;
        }
        public Batsman build() {
            return new Batsman(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batsman batsman = (Batsman) o;
        return runScored == batsman.runScored &&
                ratings == batsman.ratings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(runScored, ratings);
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "runScored=" + runScored +
                ", ratings=" + ratings +
                '}';
    }
}
