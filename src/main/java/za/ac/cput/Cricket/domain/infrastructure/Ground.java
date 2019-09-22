package za.ac.cput.Cricket.domain.infrastructure;

import java.util.Objects;

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

    public void setSize(int size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGroundId(String groundId) {
        this.groundId = groundId;
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

        @Override
        public String toString() {
            return "Builder{" +
                    "size=" + size +
                    ", capacity=" + capacity +
                    ", groundId='" + groundId + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return size == builder.size &&
                    capacity == builder.capacity &&
                    groundId.equals(builder.groundId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(size, capacity, groundId);
        }
    }


}
