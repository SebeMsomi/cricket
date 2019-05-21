package za.ac.cput.Cricket.factory.records;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Medium;

public class MediumFactoryTest {

    @Test
    public void getMedium() {
        String speed = "120";
        Medium f = MediumFactory.getMedium(speed);
        Assert.assertNotNull(speed);
    }
}