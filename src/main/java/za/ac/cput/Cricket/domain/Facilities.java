package za.ac.cput.Cricket.domain;

public class Facilities {
    private String hotelId;
    private String kit;
    private String medical;


    private Facilities(){}

    private Facilities(Builder builder) {
        this.hotelId = builder.hotelName;
        this.kit = builder.kit;
        this.medical = builder.medical;
    }

    public String hotelId() {
        return hotelId;
    }

    public String getKit() {
        return kit;
    }

    public String getMedical() {
        return medical;
    }

    public static class Builder{

        private String hotelName, medical, kit;

        public Builder medical(String medical) {
            this.medical = medical;
            return this;
        }

        public Builder hotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }

        public Builder kit(String kit) {
            this.kit = kit;
            return this;
        }

        public Facilities build() {
            return new Facilities(this);
        }

    }
}