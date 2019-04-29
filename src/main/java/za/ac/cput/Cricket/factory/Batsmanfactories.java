package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Batsman;

public class Batsmanfactories {
    public static Batsman getBatsman(int ratings, int runScored)
    {
        return new Batsman.Builder()
                .ratings(ratings)
                .runScored(runScored)
                .build();
    }
}
