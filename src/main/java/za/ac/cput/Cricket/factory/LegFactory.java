package za.ac.cput.Cricket.factory;
import za.ac.cput.Cricket.domain.Leg;

public class LegFactory {

    public static Leg getLeg(String role)
    {
        return new Leg.Builder()
                .role(role)
                .build();
    }
}
