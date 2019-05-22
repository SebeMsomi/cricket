package za.ac.cput.Cricket.repos.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.members.MainEmpire;
import za.ac.cput.Cricket.factory.members.MainEmpireFactory;
import za.ac.cput.Cricket.repos.interfaces.MainEmpireRepo;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainEpireRepoImpTest {
    private MainEmpireRepo repository;
    private MainEmpire empire;

    private MainEmpire getSavedCourse() {
        Set<MainEmpire> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = MainEpireRepoImp.getRepository();
        this.empire = MainEmpireFactory.getMain("");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
        Set<MainEmpire> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }

    @Test
    public void create() {
        MainEmpire created = this.repository.create(this.empire);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.empire);
    }

    @Test
    public void update() {
        String newname = "New Empire update";
        MainEmpire empire = new MainEmpire.Builder().role(newname).build();
        System.out.println("In update, about_to_updated = " + empire);
        MainEmpire updated = this.repository.update(empire);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getRole());
        getAll();
    }

    @Test
    public void delete() {
        MainEmpire savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getRole());
        getAll();
    }

    @Test
    public void read() {
        MainEmpire savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getRole());
        MainEmpire read = this.repository.read(savedCourse.getRole());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }

}