package za.ac.cput.Cricket.factory.recess;

import za.ac.cput.Cricket.domain.recess.Break;
import za.ac.cput.Cricket.util.BreakUtil;

public class BreakFactory {
    public static Break getBreak(String type)
    {
        return new Break.Builder().type(BreakUtil.genes())
                .type(type)
                .build();
    }
}
