package za.ac.cput.Cricket.domain.records;

import java.util.Objects;

public class Runner {
    private String law24;

    private Runner(){}

    private Runner(Builder builder) {
        this.law24 = builder.law24;
    }

    public String getLaw24() {
        return law24;
    }

    public static class Builder{
        private String law24;

        public Builder law24(String law24) {
            this.law24 = law24;
            return this;
        }
        public Runner build() {
            return new Runner(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return law24.equals(runner.law24);
    }

    @Override
    public int hashCode() {
        return Objects.hash(law24);
    }

    @Override
    public String toString() {
        return "Runner{" +
                "law24='" + law24 + '\'' +
                '}';
    }
}
