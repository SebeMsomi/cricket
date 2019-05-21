package za.ac.cput.Cricket.factory.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Facilities;

public class Facilitiesfactory {
    public static Facilities getCourse(String hotelId, String kit, String medical) {
        return new Facilities.Builder()
                .hotelId(hotelId)
                .kit(kit)
                .medical(medical)
                .build();
    }
}
