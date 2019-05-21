package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Medium;

import static org.junit.Assert.*;

public class MediumFactoryTest {

    @Test
    public void getMedium() {
        String speed = "120";
        Medium f = MediumFactory.getMedium(speed);
        Assert.assertNotNull(speed);
    }
}