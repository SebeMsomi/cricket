package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Medium;

public class MediumFactory {
    public static Medium getMedium(String speed) {
        return new Medium.Builder()
                .speed(speed)
                .build();
    }
}
