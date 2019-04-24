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
                "delivery that a bowler can bowl These deliveries vary by:" +
                " technique, the hand the bowler bowls with, use of the fingers," +
                " use of the seam, how the ball is positioned in the hand," +
                " where the ball is pitched on the wicket, the speed of the ball," +
                " and the tactical intent of the bowler";



        Bowler c = BowlerFactory.getBowler(type);
        System.out.println(c);

        Assert.assertNotNull(c.getType());
    }
}