package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Runner;

import static org.junit.Assert.*;

public class RunnerFactoryTest {

    @Test
    public void getRunner() {
        String law24 = "In cricket, a runner is a team member who runs " +
                "between the wickets for an injured batsman. " +
                "This is covered by Law 25 of the Laws of Cricket. ... " +
                "A runner can only be used if the umpires, together, " +
                "are satisfied that the batsman has sustained an injury " +
                "during the match that affects his/her ability to run.";

        Runner r = RunnerFactory.getRunner(law24);
        r.getLaw24();
        r.toString();
        System.out.println(r);

        Assert.assertNotNull(r);
    }
}