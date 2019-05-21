package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.MainEmpire;

public class MainEmpireFactory {
    public static MainEmpire getMain(String role)
    {
        return new MainEmpire.Builder()
                .role(role)
                .build();
    }
}
