package za.ac.cput.Cricket.factory.members;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.factory.members.LegFactory;

public class LegFactoryTest {

    @Test
    public void getLeg() {
        String role = "On the field of play, there are two umpires officiating a match. ..." +
                " The umpire at the bowler's end makes decisions on lbw appeals, " +
                "no balls, wides and leg byes. ";

        Leg c = LegFactory.getLeg(role);
        Assert.assertNotNull(c);

    }
}