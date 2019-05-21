package za.ac.cput.Cricket.repos.infrastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.factory.infrastructure.GroundFactory;

import java.util.Set;

import static org.junit.Assert.*;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GroundRepoImpTest {

    private GroundRepoImp repository;
    private Ground ground;

    @Before
    public void setUp() throws Exception {
        this.repository= (GroundRepoImp) GroundRepoImp.getRepository();
        this.ground = GroundFactory.getGround(500,1,"newlands");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Ground created = this.repository.create(this.ground);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.ground);
    }

    @Test
    public void read() {
        Ground read = this.repository.read(ground.getGroundId());
        System.out.println("the read, read = " + read);
        getAll();
        assertNotSame(read,ground);
    }

    @Test
    public void delete() {
        this.repository.delete(ground.getGroundId());
        getAll();
    }

    @Test
    public void update() {
        String newFixedId = "002345";
        Ground updated = new Ground.Builder().groundId(newFixedId).Build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertEquals(newFixedId,updated.getGroundId());
        getAll();
    }

    @Test
    public void getAll() {

            Set<Ground> grounds = this.repository.getAll();
            System.out.println("In get all," + grounds);

    }
}