package za.ac.cput.Cricket.factory.recess;

import za.ac.cput.Cricket.domain.recess.Break;


public class BreakFactory {
    public static Break getBreak(String type)
    {
        return new Break.Builder()
                .type(type)
                .build();
    }
}
