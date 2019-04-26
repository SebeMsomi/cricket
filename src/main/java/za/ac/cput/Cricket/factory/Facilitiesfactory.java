package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Facilities;

public class Facilitiesfactory {
    public static Facilities getCourse(String hotelName, String kit, String medical) {
        return new Facilities.Builder()
                .hotelName(hotelName)
                .kit(kit)
                .medical(medical)
                .build();
    }
}
