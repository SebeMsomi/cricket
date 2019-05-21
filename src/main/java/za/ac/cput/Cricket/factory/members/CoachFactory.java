package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.Coach;

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
