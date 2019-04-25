package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Break;
import za.ac.cput.Cricket.util.BreakUtil;

public class BreakFactory {
    public static Break getBreak(String type)
    {
        return new Break.Builder().type(BreakUtil.genes())
                .type(type)
                .build();
    }
}
