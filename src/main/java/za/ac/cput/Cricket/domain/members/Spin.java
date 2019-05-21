package za.ac.cput.Cricket.domain.members;

import java.util.Objects;

public class Spin {
    private String type;

    private Spin(){}

    private Spin (Builder builder) {
        this.type = builder.type;
    }

    public String getType() {
        return type;
    }

    public static class Builder{
        private String type;

        public Builder type(String type) {
            this.type = type;
            return this;
        }
        public Spin build() {
            return new Spin(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spin spin = (Spin) o;
        return type.equals(spin.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Spin{" +
                "type='" + type + '\'' +
                '}';
    }
}
