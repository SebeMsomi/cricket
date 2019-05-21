package za.ac.cput.Cricket.factory.members;
import za.ac.cput.Cricket.domain.members.Leg;

public class LegFactory {

    public static Leg getLeg(String role)
    {
        return new Leg.Builder()
                .role(role)
                .build();
    }
}
