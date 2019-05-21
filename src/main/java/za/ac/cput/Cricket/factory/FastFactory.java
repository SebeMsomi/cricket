package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Fast;

public class FastFactory {
    public static Fast getFast(String mph) {
        return new Fast.Builder()
                .mph(mph)
                .build();
    }


}
