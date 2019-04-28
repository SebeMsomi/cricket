package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Spin;

public class Spinfactory {
    public static Spin getSpin(String type)
    {
        return new Spin.Builder()
                .type(type)
                .build();
    }
}
