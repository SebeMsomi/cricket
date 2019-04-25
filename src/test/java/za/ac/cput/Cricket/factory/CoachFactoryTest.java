package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Coach;

import static org.junit.Assert.*;

public class CoachFactoryTest {

    @Test
    public void getCoach() {
        String name = "se";
        Coach c = CoachFactory.getCoach(name);
        System.out.println(c);
        Assert.assertNotNull(c.getAge());
    }
}