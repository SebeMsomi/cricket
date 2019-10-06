package za.ac.cput.Cricket.domain.members;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Bowler {

    private String type;

    private Bowler(){}

    public String getType() {
        return type;
    }

    private Bowler(Builder builder) {


        this.type = builder.type;

    }
    public static class Builder
    {
        private String type;

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Bowler build(){
            return new Bowler(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bowler bowler = (Bowler) o;
        return type.equals(bowler.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
