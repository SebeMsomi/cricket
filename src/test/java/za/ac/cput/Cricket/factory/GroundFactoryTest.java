package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Ground;

public class GroundFactoryTest {
    @Test
    public void getGround() {
        int size = 150;
        int capacity = 66000;
        String groundId = "";

        Ground g = GroundFactory.getGround(size,capacity,groundId);
        System.out.println(g);

        Assert.assertNotNull("The biggest size and capacity are as follows",g);
    }
}
