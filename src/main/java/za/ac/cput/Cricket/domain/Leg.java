package za.ac.cput.Cricket.domain;

import javafx.util.Builder;

public class Leg {
    private String role;

    private Leg(){}

    public String getRole() {
        return role;
    }
    private Leg(Builder builder) {


        this.role = builder.role;

    }
    public static class Builder
    {

        private String role;

        public Builder role(String role){
            this.role = role;
            return this;
        }

        public Leg build(){
            return new Leg(this);
        }
    }


    @Override
    public String toString() {
        return "Leg{" +
                "role='" + role + '\'' +
                '}';
    }
}
