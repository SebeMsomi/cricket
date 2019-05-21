package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.Spin;

public class Spinfactory {
    public static Spin getSpin(String type)
    {
        return new Spin.Builder()
                .type(type)
                .build();
    }
}
