package za.ac.cput.Cricket.service.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.factory.members.Empirefactory;
import za.ac.cput.Cricket.repos.members.impl.EmpireRepoImp;

import java.util.Set;

public class EmpireServiceImpTest {
    private EmpireRepoImp repository;
    private Empire empire;
    private Empire getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EmpireRepoImp) EmpireRepoImp.getRepository();
        this.empire = Empirefactory.getEmpire("three types of empire");
    }
    @Test
    public void a_create() {
        Empire created = this.repository.create(this.empire);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.empire);
    }


    @Test
    public void getService() {
    }


    @Test
    public void e_delete() {
        Empire saved = getSaved();
        this.repository.delete(saved.getEmpireId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Empire saved = getSaved();
        Empire read = this.repository.read(saved.getEmpireId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Empire> courses = this.repository.getAll();
        System.out.println("In getall, all = " + courses);
    }

}