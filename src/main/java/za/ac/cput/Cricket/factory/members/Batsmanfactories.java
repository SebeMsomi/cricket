package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.Batsman;

public class Batsmanfactories {
    public static Batsman getBatsman(String batsmanId, int runScored)
    {
        return new Batsman.Builder()
                .batsmanId(batsmanId)
                .runScored(runScored)
                .build();
    }
}
