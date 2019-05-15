package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Coach;

public class CoachFactory {
    public static Coach getCoach(String name, int age, String experience, String coachId)
    {
        return new Coach.Builder()
                .name(name)
                .age(age)
                .experience(experience)
                .coachId(coachId)
                .build();
    }
}
