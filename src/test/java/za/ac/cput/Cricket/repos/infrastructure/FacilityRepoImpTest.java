package za.ac.cput.Cricket.repos.infrastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;

import java.util.Set;

import static org.junit.Assert.*;

public class FacilityRepoImpTest {
    @Autowired
    private FacilityRepoImp repository;
    private Facilities facilities;
    private String hotelId=null;

    @Before
    public void setUp() throws Exception {
        this.repository= (FacilityRepoImp) FacilityRepoImp.getRepository();
        this.facilities = Facilitiesfactory.getCourse("","","");
    }

    @Test
    public void getRepository() {
        Facilities facilities = Facilitiesfactory.getCourse("protea","Physio","IDDC");

        Facilities result = repository.create(facilities);
        hotelId = result.gethotelId();
        Assert.assertNotNull(facilities);
    }

    @Test
    public void create() {
        Facilities created = this.repository.create(this.facilities);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.facilities);
    }

    @Test
    public void read() {
        Facilities read = this.repository.read(facilities.gethotelId());
        System.out.println("the read, read = " + read);
        getAll();
        assertNotSame(read,facilities);
    }

    @Test
    public void delete() {
        this.repository.delete(facilities.gethotelId());
        getAll();
    }

    @Test
    public void update() {
        String newFixedId = "002345";
        Facilities updated = new Facilities.Builder().hotelId(newFixedId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertEquals(newFixedId,updated.gethotelId());
        getAll();
    }

    @Test
    public void getAll() {

        Set<Facilities> grounds = this.repository.getAll();
        System.out.println("In get all," + grounds);

    }
}