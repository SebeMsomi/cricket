package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Batsman;

import static org.junit.Assert.*;

public class BatsmanfactoriesTest {

    @Test
    public void getBatsman() {

        int rating = 0, runSoored = 0;

        Batsman b = Batsmanfactories.getBatsman(rating,runSoored);
        Assert.assertNotNull(b);

    }
}