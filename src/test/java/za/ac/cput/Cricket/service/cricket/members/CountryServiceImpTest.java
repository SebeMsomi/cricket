package za.ac.cput.Cricket.service.cricket.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.factory.records.Countryfactory;
import za.ac.cput.Cricket.repos.records.CountryRepoImp;

import java.util.Set;

public class CountryServiceImpTest {
    private CountryRepoImp repository;
    private Country country;
    private Country getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (CountryRepoImp) CountryRepoImp.getRepository();
        this.country = Countryfactory.getCountry("RSA","+27");
    }
    @Test
    public void a_create() {
        Country created = this.repository.create(this.country);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.country);
    }


    @Test
    public void getService() {
    }


    @Test
    public void e_delete() {
        Country saved = getSaved();
        this.repository.delete(saved.getCountryID());
        d_getAll();
    }

    @Test
    public void b_read() {
        Country saved = getSaved();
        Country read = this.repository.read(saved.getCountryID());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Country> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }
}