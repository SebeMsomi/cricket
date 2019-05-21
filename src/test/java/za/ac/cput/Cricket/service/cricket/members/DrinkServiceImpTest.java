package za.ac.cput.Cricket.service.cricket.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.recess.Drink;
import za.ac.cput.Cricket.factory.recess.DrinkFactory;
import za.ac.cput.Cricket.repos.recess.DrinkRepoImp;

import java.util.Set;

public class DrinkServiceImpTest {
    private DrinkRepoImp repository;
    private Drink drink;
    private Drink getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (DrinkRepoImp) DrinkRepoImp.getRepository();
        this.drink = DrinkFactory.getDrink("12:00","early");
    }
    @Test
    public void a_create() {
        Drink created = this.repository.create(this.drink);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.drink);
    }


    @Test
    public void getService() {
    }


    @Test
    public void e_delete() {
        Drink saved = getSaved();
        this.repository.delete(saved.getDrinkId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Drink saved = getSaved();
        Drink read = this.repository.read(saved.getDrinkId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Drink> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }

}