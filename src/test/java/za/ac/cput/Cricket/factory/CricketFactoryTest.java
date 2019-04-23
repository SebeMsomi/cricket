package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Cricket;

import static org.junit.Assert.*;

public class CricketFactoryTest {

    @Test

    public void getCricket(){
        String name = "Protea";
        String sname = "India";

        Cricket c = CricketFactory.getCricket(name, sname);
        System.out.println(c);

        Assert.assertNotNull(c.getTeam1());
    }

}