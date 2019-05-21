package za.ac.cput.Cricket.factory.infrasctructure;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;

public class FacilitiesfactoryTest {

    @Test
    public void getCourse() {
        String kit = "First Aid Kits & Physio Supplies";
        String medical = "";
        String hotelId= "";

        Facilities f = Facilitiesfactory.getCourse(kit,medical,hotelId);
        Assert.assertSame(kit,medical,hotelId);
    }
}