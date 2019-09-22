package za.ac.cput.Cricket.service.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacilitiesServiceTest {
    @Autowired
    private FacilityServiceImp facilityServiceImp;

    @Test
    public void create() {

        Facilities facilities = Facilitiesfactory.getCourse(
                "1","medicine","med"
        );
        facilityServiceImp.create(facilities);

        assertNotNull(facilityServiceImp.getAll());

    }
    @Test
    public void read() {
        Facilities facilities =Facilitiesfactory.getCourse(
                "1","medicine","med"
        );
        facilityServiceImp.create(facilities);
        Facilities facilities1 = facilityServiceImp.read(facilities.gethotelId());
        assertEquals(facilities, facilities1);

    }
    @Test
    public void delete() {

        Facilities facilities =Facilitiesfactory.getCourse(
                "1","medicine","med"
        );
        facilityServiceImp.create(facilities);
        assertNotNull(facilityServiceImp.getAll());
        facilityServiceImp.delete(facilities.gethotelId());



    }
}
