package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Spin;

import static org.junit.Assert.*;

public class SpinfactoryTest {

    @Test
    public void getSpin() {
        String type = "There are mainly two types of spin bowling- 1. " +
                "Off Spin 2. Leg spin( wrist spin)";

        Spin s = Spinfactory.getSpin(type);
        s.getType();
        s.toString();
        System.out.println(s);
        Assert.assertTrue("These",s.equals(s));
    }
}