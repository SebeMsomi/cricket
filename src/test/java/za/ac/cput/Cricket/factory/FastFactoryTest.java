package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Fast;

import static org.junit.Assert.*;

public class FastFactoryTest {

    @Test
    public void getFast() {
        String mph = "100.23";
        Fast f = FastFactory.getFast(mph);
        Assert.assertNotNull(mph);
    }
}