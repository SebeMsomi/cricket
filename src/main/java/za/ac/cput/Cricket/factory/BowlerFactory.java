package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.util.BowlerUtil;
import za.ac.cput.Cricket.domain.Bowler;

public class BowlerFactory {
    public static Bowler getBowler(String type)
    {
        return new Bowler.Builder().type(BowlerUtil.genes())
                .type(type)
                .build();
    }
}
