package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Empire;

public class Empirefactory {
    public static Empire getEmpire(String type)
    {
        return new Empire.Builder()
                .type(type)
                .build();
    }
}
