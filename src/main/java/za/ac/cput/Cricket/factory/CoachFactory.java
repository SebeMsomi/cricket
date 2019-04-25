package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Coach;

public class CoachFactory {
    public static Coach getCoach(String name, int age, String experience)
    {
        return new Coach.Builder()
                .name("Ottis Gibson")
                .age(50)
                .experience("20 years")
                .build();
    }
}
