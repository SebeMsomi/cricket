package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.ThirdEmpire;

public class ThirdFactory {
    public static ThirdEmpire getThirdEmpire(String role)
    {
        return new ThirdEmpire.Builder()
                .role(role)
                .build();
    }

}
