package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.domain.Cricket;

import static org.junit.Assert.*;

public class BowlerFactoryTest {

    @Test

    public void getCricket(){
        String type = "Delivery, There are many different types of " +
                "delivery that a bowler can bowl";



        Bowler c = BowlerFactory.getBowler(type);
        System.out.println(c);

        Assert.assertNotNull(c.getType());
    }
}