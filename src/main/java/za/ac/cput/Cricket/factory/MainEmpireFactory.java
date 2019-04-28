package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.MainEmpire;

public class MainEmpireFactory {
    public static MainEmpire getMain(String role)
    {
        return new MainEmpire.Builder()
                .role(role)
                .build();
    }
}
