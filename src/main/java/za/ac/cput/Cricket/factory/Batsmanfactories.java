package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Batsman;

public class Batsmanfactories {
    public static Batsman getBatsman(String batsmanId, int runScored)
    {
        return new Batsman.Builder()
                .batsmanId(batsmanId)
                .runScored(runScored)
                .build();
    }
}
