package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.factory.CricketFactory;
import za.ac.cput.Cricket.repos.impl.CricketRepositoryImp;


import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CricketServiceImpTest {
        private CricketRepositoryImp repository;
        private Cricket cricket;

    private Cricket getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (CricketRepositoryImp) CricketRepositoryImp.getRepository();
        this.cricket = CricketFactory.getCricket("Protea", "India");
    }
    @Test
    public void a_create() {
        Cricket created = this.repository.create(this.cricket);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.cricket);
    }

    @Test
    public void e_delete() {
        Cricket saved = getSaved();
        this.repository.delete(saved.getCricketId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Cricket saved = getSaved();
        Cricket read = this.repository.read(saved.getCricketId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Cricket> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}