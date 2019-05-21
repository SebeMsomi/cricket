package za.ac.cput.Cricket.repos.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.factory.members.LegFactory;
import za.ac.cput.Cricket.repos.interfaces.LegRepo;

import java.util.Set;

import static org.junit.Assert.*;

public class LegRepoImpTest {
    private LegRepo repository;
    private Leg empire;

    private Leg getSavedCourse() {
        Set<Leg> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LegRepoImp.getRepository();
        this.empire = LegFactory.getLeg("");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
        Set<Leg> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }

    @Test
    public void create() {
        Leg created = this.repository.create(this.empire);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.empire);
    }

    @Test
    public void update() {
        String newname = "New Empire update";
        Leg empire = new Leg.Builder().role(newname).build();
        System.out.println("In update, about_to_updated = " + empire);
        Leg updated = this.repository.update(empire);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getRole());
        getAll();
    }

    @Test
    public void delete() {
        Leg savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getRole());
        getAll();
    }

    @Test
    public void read() {
        Leg savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getRole());
        Leg read = this.repository.read(savedCourse.getRole());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }
}