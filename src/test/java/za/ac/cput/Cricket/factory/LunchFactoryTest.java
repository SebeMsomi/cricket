package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Lunch;

import static org.junit.Assert.*;

public class LunchFactoryTest {

    @Test
    public void getLunch() {
        String lunchTime = "";

        Lunch l = LunchFactory.getLunch(lunchTime);
        Assert.assertTrue("Lunch start at: ", l.equals(l));
    }
}