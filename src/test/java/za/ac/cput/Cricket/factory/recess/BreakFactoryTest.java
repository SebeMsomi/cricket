package za.ac.cput.Cricket.factory.recess;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.recess.Break;
import za.ac.cput.Cricket.factory.recess.BreakFactory;

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