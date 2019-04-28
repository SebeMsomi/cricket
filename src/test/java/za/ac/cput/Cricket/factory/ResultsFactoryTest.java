package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Result;

import static org.junit.Assert.*;

public class ResultsFactoryTest {

    @Test
    public void getResult() {
        int ress = 0;
        int wicket = 0;

        Result r = ResultsFactory.getResult(ress,wicket);
        Assert.assertNotNull(r);
    }
}