package za.ac.cput.Cricket.domain;

public class Facilities {
    private static String hotelId;
    private static String kit;
    private static String medical;


    private Facilities(){}

    private Facilities(Builder builder) {
        this.hotelId = builder.hotelId;
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

        private String hotelId, medical, kit;

        public Builder copy(Facilities facilities){
            this.kit = Facilities.kit;
            this.medical = Facilities.medical;
            this.hotelId = Facilities.hotelId;
            return this;
        }

        public Builder medical(String medical) {
            this.medical = medical;
            return this;
        }

        public Builder hotelId(String hotelId) {
            this.hotelId = hotelId;
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
