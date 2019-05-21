package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Facilities;

public class Facilitiesfactory {
    public static Facilities getCourse(String hotelId, String kit, String medical) {
        return new Facilities.Builder()
                .hotelId(hotelId)
                .kit(kit)
                .medical(medical)
                .build();
    }
}
