package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Facilities;

import static org.junit.Assert.*;

public class FacilitiesfactoryTest {

    @Test
    public void getCourse() {
        String kit = "First Aid Kits & Physio Supplies";
        String medical = "";
        String hotelName= "";

        Facilities f = Facilitiesfactory.getCourse(kit,medical,hotelName);
        Assert.assertSame(kit,medical,hotelName);
    }
}