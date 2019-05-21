package za.ac.cput.Cricket.domain.recess;

import java.util.Objects;

public class Break {
    private String type;

    private Break(){}

    public String getType() {
        return type;
    }

    private Break(Builder builder) {


        this.type = builder.type;

    }
    public static class Builder
    {
        private String type;

        public Break.Builder type(String type){
            this.type = type;
            return this;
        }

        public Break build(){
            return new Break(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Break abreak = (Break) o;
        return type.equals(abreak.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
