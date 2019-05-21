package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Runner;

public class RunnerFactory {
    public static Runner getRunner(String law24)
    {
        return new Runner.Builder()
                .law24(law24)
                .build();
    }
}
