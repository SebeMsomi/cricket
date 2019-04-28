package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.ThirdEmpire;

import static org.junit.Assert.*;

public class ThirdFactoryTest {

    @Test
    public void getThirdEmpire() {
        String role = "The third umpire (or TV Umpire) is an off-field umpire in international " +
                "cricket matches who makes the final decision in questions " +
                "referred to him by the two on-field umpires. " +
                "Television replays and other technology are available to " +
                "the third umpire to assist him in coming to a decision.";

        ThirdEmpire  t = ThirdFactory.getThirdEmpire(role);
        t.getRole();
        t.toString();
        System.out.println(t);
        Assert.assertTrue("True", t.equals(t));
    }
}