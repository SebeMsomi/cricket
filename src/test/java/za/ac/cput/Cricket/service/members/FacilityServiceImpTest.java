package za.ac.cput.Cricket.service.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;
import za.ac.cput.Cricket.repos.infrastructure.FacilityRepoImp;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacilityServiceImpTest {
    private FacilityRepoImp repository;
    private Facilities facilities;

    @Before
    public void setUp() throws Exception {
        this.repository= (FacilityRepoImp) FacilityRepoImp.getRepository();
        this.facilities = Facilitiesfactory.getCourse("Protea Hotel"," Bat, Pads, Gloves, Helmet, Thigh",
                "The ICC's Medical Advisory Committee");
    }
    @Test
    public void d_getAll() {
        Set<Facilities> facilities1 = this.repository.getAll();
        System.out.println("In get all," + facilities1);
    }

    @Test
    public void getService() {
    }

    @Test
    public void create() {
        Facilities created = this.repository.create(this.facilities);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.facilities);
    }

    @Test
    public void update() {
        String newChechId = "002345";
        Facilities updated = new Facilities.Builder().hotelId(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertEquals(newChechId,updated.gethotelId());
        d_getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(facilities.gethotelId());
        d_getAll();
    }

    @Test
    public void read() {
        Facilities read = this.repository.read(facilities.gethotelId());
        System.out.println("the read, read = " + read);
        d_getAll();
        assertNotSame(read,facilities);
    }

    @Test
    public void getAll() {
    }
}