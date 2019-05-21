package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Fast;

public class FastFactory {
    public static Fast getFast(String mph) {
        return new Fast.Builder()
                .mph(mph)
                .build();
    }


}
