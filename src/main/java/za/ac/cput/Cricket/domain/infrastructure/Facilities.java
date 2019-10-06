package za.ac.cput.Cricket.domain.infrastructure;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facilities {
    @Id
    private static String hotelId;
    private static String kit;
    private static String medical;


    private Facilities(){}

    private Facilities(Builder builder) {
        this.hotelId = builder.hotelId;
        this.kit = builder.kit;
        this.medical = builder.medical;
    }

    public String gethotelId() {
        return hotelId;
    }

    public String getKit() {
        return kit;
    }

    public String getMedical() {
        return medical;
    }

    public static void setHotelId(String hotelId) {
        Facilities.hotelId = hotelId;
    }

    public static void setKit(String kit) {
        Facilities.kit = kit;
    }

    public static void setMedical(String medical) {
        Facilities.medical = medical;
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

        public void setHotelId(String hotelId) {
            this.hotelId = hotelId;
        }

        public void setMedical(String medical) {
            this.medical = medical;
        }

        public void setKit(String kit) {
            this.kit = kit;
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
