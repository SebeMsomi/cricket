package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.factory.CricketFactory;


import java.util.Set;

import static org.junit.Assert.*;

public class CricketServiceImpTest {
    private CricketServiceImp repository;
    private Cricket cricket;


    private Cricket getSaved(){
        return this.repository.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository = CricketServiceImp.getRepository();
        this.cricket = CricketFactory.getCricket("Protea","India");
    }

    @After
    public void tearDown() throws Exception {
        Cricket cr = this.repository.create(this.cricket);
        System.out.println("In create, created = " + cr);
        Assert.assertNotNull(cr);
        Assert.assertSame(cr, this.cricket);
    }

    @Test
    public void create() {

    }

    @Test
    public void update() {
        String cricketName = "Protea";
        Cricket updated = new Cricket.Builder().copy(getSaved()).cricketName(cricketName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(cricketName, updated.getTeam1());
    }

    @Test
    public void delete() {
        Cricket saved = getSaved();
        this.repository.delete(saved.getCricketId());
        getAll();

    }

    @Test
    public void read() {
        Cricket saved = getSaved();
        Cricket read = this.repository.read(saved.getCricketId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void getAll() {
        Set<Cricket> crickets = this.repository.getAll();
        System.out.println("In getall, all = " + crickets);
    }
}