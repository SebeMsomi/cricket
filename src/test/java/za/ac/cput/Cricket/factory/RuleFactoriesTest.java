package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Rules;

import static org.junit.Assert.*;

public class RuleFactoriesTest {

    @Test
    public void getResult() {
        String rules = "";
        Rules c = RuleFactories.getRule(rules);
        Assert.assertNotNull(c);
    }
}