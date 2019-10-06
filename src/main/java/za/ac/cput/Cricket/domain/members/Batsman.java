package za.ac.cput.Cricket.domain.members;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Batsman {
    @Id
    private int runScored;
    @Column(name = "runScored" )
    private String batsmanId;

    private Batsman(){}

    private Batsman (Builder builder)
    {
        this.batsmanId = builder.batsmanId;
        this.runScored = builder.runScored;
    }

    public int getRunScored() {
        return runScored;
    }

    public String getBatsmanId() {
        return batsmanId;
    }

    public static class Builder{
        private String batsmanId;
        private int runScored;

        public Builder runScored(int runScored) {
            this.runScored = runScored;
            return this;
        }

        public Builder batsmanId(String batsmanId) {
            this.batsmanId = batsmanId;
            return this;
        }
        public Batsman build() {
            return new Batsman(this);
        }

        public Object copy(Batsman savedCourse) {
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batsman batsman = (Batsman) o;
        return runScored == batsman.runScored &&
                batsmanId == batsman.batsmanId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(runScored, batsmanId);
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "runScored=" + runScored +
                ", ratings=" + batsmanId +
                '}';
    }
}
