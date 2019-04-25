package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.domain.Break;

import static org.junit.Assert.*;

public class BreakFactoryTest {

    @Test
    public void getbreak()
    {
        String type = "the type of Break is either: Lunch or Drink";
        Break c = BreakFactory.getBreak(type);
        System.out.println(c);

        Assert.assertNotNull(c.getType());
    }

}