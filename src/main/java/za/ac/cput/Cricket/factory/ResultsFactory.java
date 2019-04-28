package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Result;

public class ResultsFactory {
    public static Result getResult(int wicket,int ress)
    {
        return new Result.Builder()
                .wicket(wicket)
                .ress(ress)
                .build();
    }
}
