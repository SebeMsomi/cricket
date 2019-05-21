package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Medium;

public class MediumFactory {
    public static Medium getMedium(String speed) {
        return new Medium.Builder()
                .speed(speed)
                .build();
    }
}
