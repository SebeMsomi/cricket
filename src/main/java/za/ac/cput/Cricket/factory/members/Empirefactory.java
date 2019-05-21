package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.Empire;

public class Empirefactory {
    public static Empire getEmpire(String type)
    {
        return new Empire.Builder()
                .type(type)
                .build();
    }
}
