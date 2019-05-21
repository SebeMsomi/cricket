package za.ac.cput.Cricket.factory.members;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.factory.members.Batsmanfactories;

public class BatsmanfactoriesTest {

    @Test
    public void getBatsman() {

        String batsmanId = "";
        int runSoored = 0;

        Batsman b = Batsmanfactories.getBatsman(batsmanId,runSoored);
        Assert.assertNotNull(b);

    }
}