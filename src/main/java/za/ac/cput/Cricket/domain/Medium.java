package za.ac.cput.Cricket.domain;

public class Medium {
    private String speed;

    private Medium(){}

    private Medium(Builder builder) {
        this.speed = builder.speed;
    }

    public String getSpeed() {
        return speed;
    }

    public static class Builder{
        private String speed;
        public Builder speed(String speed) {
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
