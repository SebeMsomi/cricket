package za.ac.cput.Cricket.repos.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.factory.members.Empirefactory;
import za.ac.cput.Cricket.repos.members.impl.EmpireRepoImp;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpireRepoImpTest {
    private EmpireRepo repository;
    private Empire empire;

    private Empire getSavedCourse() {
        Set<Empire> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmpireRepoImp.getRepository();
        this.empire = Empirefactory.getEmpire("Three types");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
        Set<Empire> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }

    @Test
    public void create() {
        Empire created = this.repository.create(this.empire);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.empire);
    }

    @Test
    public void update() {
        String newname = "New Empire update";
        Empire empire = new Empire.Builder().empireId(newname).build();
        System.out.println("In update, about_to_updated = " + empire);
        Empire updated = this.repository.update(empire);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getEmpireId());
        getAll();
    }

    @Test
    public void delete() {
        Empire savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getEmpireId());
        getAll();
    }

    @Test
    public void read() {
        Empire savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getEmpireId());
        Empire read = this.repository.read(savedCourse.getEmpireId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }
}