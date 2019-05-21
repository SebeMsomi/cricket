package za.ac.cput.Cricket.domain;

import java.util.Calendar;

public class Ground {
    private  int size;
    private int capacity;
    private String groundId;

    private Ground(){}

    public Ground(Builder builder)
    {
        this.capacity = builder.capacity;
        this.size = builder.size;
        this.groundId = builder.groundId;

    }

    public String getGroundId() {
        return groundId;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public static class Builder
    {
        private int size;
        private int capacity;
        private String groundId;
        //private Set<Team> teams;

        public Builder groundId(String groundId)
        {
            this.groundId = groundId;
            return this;
        }
        public Builder size(int size)
        {
            this.size = size;
            return this;
        }

        public Builder capacity(int capacity)
        {
            this.capacity = capacity;
            return this;
        }

        public Ground Build()
        {
            return new Ground(this);
        }
    }


}
