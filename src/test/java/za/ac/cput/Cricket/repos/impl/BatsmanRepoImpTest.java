package za.ac.cput.Cricket.repos.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.interfaces.BatsmanInterface;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BatsmanRepoImpTest {
    private BatsmanInterface repository;
    private Batsman batsmans;

    private Batsman getSavedBatsman() {
        Set<Batsman> savedBatsman = this.repository.getAll();
        return savedBatsman.iterator().next();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Batsman created = this.repository.create(this.batsmans);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.batsmans);
    }

    @Test
    public void read() {
        Batsman savedBatsman = getSavedBatsman();
        System.out.println("In read, courseId = "+ savedBatsman.getRunScored());
        Batsman read = this.repository.read(savedBatsman.getBatsmanId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedBatsman, read);
    }

    @Test
    public void delete() {
        Batsman savedCourse = getSavedBatsman();
        this.repository.delete(savedCourse.getBatsmanId());
        getAll();
    }

    /*@Ignore
    public void update() {
        String newname = "New Test Batsman Name";
        Batsman batsman = new Batsman.Builder().copy(getSavedBatsman()).batsmanId(newname).build();
        System.out.println("In update, about_to_updated = " + batsmans);
        Batsman updated = this.repository.update(batsmans);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getBatsmanId());
        getAll();
    }*/

    @Test
    public void getAll() {
        Set<Batsman> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}