package za.ac.cput.Cricket.factory.recess;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.recess.Lunch;
import za.ac.cput.Cricket.factory.recess.LunchFactory;

public class LunchFactoryTest {

    @Test
    public void getLunch() {
        String lunchTime = "";

        Lunch l = LunchFactory.getLunch(lunchTime);
        Assert.assertTrue("Lunch start at: ", l.equals(l));
    }
}