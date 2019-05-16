package za.ac.cput.Cricket.domain;

public class Medium {
    private int speed;

    private Medium(){}

    private Medium(Builder builder) {
        this.speed = builder.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public static class Builder{
        private int speed;
        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }
        public Medium build() {
            return new Medium(this);
        }
    }

    @Override
    public String toString() {
        return "Medium{" +
                "speed=" + speed +
                '}';
    }
}
