package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.MainEmpire;

import static org.junit.Assert.*;

public class MainEmpireFactoryTest {

    @Test
    public void getMain() {
        String role = "The square leg umpire will judge stumpings \" +\n" +
                               "and run outs. At the end of each over, the \" +\n" +
                              "umpires change position";

        MainEmpire m = MainEmpireFactory.getMain(role);


        Assert.assertNotNull(m);
    }
}