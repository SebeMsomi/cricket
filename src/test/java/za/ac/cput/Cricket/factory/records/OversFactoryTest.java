package za.ac.cput.Cricket.factory.records;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Overs;

public class OversFactoryTest {

    @Test
    public void getOver() {
        int delivery = 6;
        int maxOvers = 90;


        Overs d = OversFactory.getOver(delivery,maxOvers);
        Assert.assertTrue("Lunch start at: ", d.equals(d));

    }
}