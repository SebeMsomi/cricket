package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Runner;

public class RunnerFactory {
    public static Runner getRunner(String law24)
    {
        return new Runner.Builder()
                .law24(law24)
                .build();
    }
}
