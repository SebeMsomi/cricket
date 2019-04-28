package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Overs;

import static org.junit.Assert.*;

public class OversFactoryTest {

    @Test
    public void getOver() {
        int delivery = 6;
        int maxOvers = 90;


        Overs d = OversFactory.getOver(delivery,maxOvers);
        Assert.assertTrue("Lunch start at: ", d.equals(d));

    }
}