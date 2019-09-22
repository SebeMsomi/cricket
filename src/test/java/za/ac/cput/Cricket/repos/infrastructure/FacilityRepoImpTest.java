package za.ac.cput.Cricket.repos.infrastructure;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;
import za.ac.cput.Cricket.repos.infrastructure.impl.FacilityRepoImp;

import java.util.Set;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FacilityRepoImpTest {
    @Autowired
    private FacilityRepoImp facilityRepoImp;

    @Test
    public void create() {
        Facilities facilities = Facilitiesfactory.getCourse("11",
                "Medical","Medicines");
        facilityRepoImp.create(facilities);
        Assert.assertNotNull(facilityRepoImp.getAll());
    }

    @Test
    public void read() {
        Facilities facilities = Facilitiesfactory.getCourse("11",
                "Medical","Medicines");
        facilityRepoImp.create(facilities);

        Facilities facilities1 = facilityRepoImp.read(facilities.gethotelId());
        assertEquals(facilities,facilities1);
    }

    @Test
    public void delete() {

    }

    @Test
    public void update() {

    }

    @Test
    public void getAll() {

        Set<Facilities> grounds = this.facilityRepoImp.getAll();
        System.out.println("In get all," + grounds);

    }
}