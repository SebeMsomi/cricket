package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Empire;

import static org.junit.Assert.*;

public class EmpirefactoryTest {

    @Test
    public void getBowler() {
        String type = "There are three types of Empire: Main, Leg Third";
        Empire c = Empirefactory.getEmpire(type);
        System.out.println(c);

        Assert.assertNotNull(c.getType());
    }
}