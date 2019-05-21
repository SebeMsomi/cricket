package za.ac.cput.Cricket.domain.records;

import java.util.Objects;

public class Rules {
    private String rules;

    private Rules(){}

    private Rules(Builder builder) {
        this.rules = builder.rules;
    }


    public String getRules() {
        return rules;
    }

    public static class Builder{
        private String rules;

        public Builder rules(String rules) {
            this.rules = rules;
            return this;
        }
        public Rules build() {
            return new Rules(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rules rules1 = (Rules) o;
        return rules.equals(rules1.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }

    @Override
    public String toString() {
        return "Rules{" +
                "rules='" + rules + '\'' +
                '}';
    }
}
