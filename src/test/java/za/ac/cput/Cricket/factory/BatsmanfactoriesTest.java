package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Batsman;

import static org.junit.Assert.*;

public class BatsmanfactoriesTest {

    @Test
    public void getBatsman() {

        String batsmanId = "";
        int runSoored = 0;

        Batsman b = Batsmanfactories.getBatsman(batsmanId,runSoored);
        Assert.assertNotNull(b);

    }
}