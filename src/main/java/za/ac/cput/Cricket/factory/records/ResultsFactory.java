package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Result;

public class ResultsFactory {
    public static Result getResult(int wicket,int ress)
    {
        return new Result.Builder()
                .wicket(wicket)
                .ress(ress)
                .build();
    }
}
