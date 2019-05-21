package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.ThirdEmpire;

public class ThirdFactory {
    public static ThirdEmpire getThirdEmpire(String role)
    {
        return new ThirdEmpire.Builder()
                .role(role)
                .build();
    }

}
