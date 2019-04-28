package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Overs;

public class OversFactory {
    public static Overs getOver(int delivevry, int maxOvers)
    {
        return new Overs.Builder()
                .delivery(delivevry)
                .maxOvers(maxOvers)
                .build();
    }
}
