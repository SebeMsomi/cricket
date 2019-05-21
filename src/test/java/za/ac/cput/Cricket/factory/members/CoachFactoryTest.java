package za.ac.cput.Cricket.factory.members;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.factory.members.CoachFactory;

public class CoachFactoryTest {

    @Test
    public void getCoach() {
        String name = "Ottis Gibson";
        String experience = "20 years";
        int age = 50;
        String coachId = "";
        Coach c = CoachFactory.getCoach(name,age,experience, coachId);
        System.out.println(c);
        Assert.assertNotEquals(c.getName(),c.getAge(),c.getExperience());
    }
}