package za.ac.cput.Cricket.factory.infrasctructure;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Fast;
import za.ac.cput.Cricket.factory.records.FastFactory;

public class FastFactoryTest {

    @Test
    public void getFast() {
        String mph = "100.23";
        Fast f = FastFactory.getFast(mph);
        Assert.assertNotNull(mph);
    }
}