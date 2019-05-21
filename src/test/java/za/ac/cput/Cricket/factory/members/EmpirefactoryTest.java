package za.ac.cput.Cricket.factory.members;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.factory.members.Empirefactory;

public class EmpirefactoryTest {

    @Test
    public void getBowler() {
        String type = "There are three types of Empire: Main, Leg Third";
        Empire c = Empirefactory.getEmpire(type);
        System.out.println(c);

        Assert.assertNotNull(c.getType());
    }
}