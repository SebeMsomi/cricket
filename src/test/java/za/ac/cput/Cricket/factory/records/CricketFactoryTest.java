package za.ac.cput.Cricket.factory.records;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Cricket;

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