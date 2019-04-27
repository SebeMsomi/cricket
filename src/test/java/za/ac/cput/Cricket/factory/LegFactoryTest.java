package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Leg;

import static org.junit.Assert.*;

public class LegFactoryTest {

    @Test
    public void getLeg() {
        String role = "On the field of play, there are two umpires officiating a match. ..." +
                " The umpire at the bowler's end makes decisions on lbw appeals, " +
                "no balls, wides and leg byes. The square leg umpire will judge stumpings " +
                "and run outs. At the end of each over, the " +
                "umpires change position";

        Leg c = LegFactory.getLeg(role);
        Assert.assertNotNull(c);

    }
}