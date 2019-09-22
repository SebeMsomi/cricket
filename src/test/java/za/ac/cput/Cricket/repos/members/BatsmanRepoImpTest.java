package za.ac.cput.Cricket.repos.members;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.factory.members.Batsmanfactories;
import za.ac.cput.Cricket.repos.members.impl.BatsmanRepoImp;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class BatsmanRepoImpTest {

    @Autowired
    private BatsmanRepoImp batsmanRepoImp;


    @Test
    public void create() {

        Batsman batsman = Batsmanfactories.getBatsman(
                "1", 50
        );
        batsmanRepoImp.create(batsman);
        assertNotNull(batsmanRepoImp.getAll());

    }

    @Test
    public void read() {
        Batsman batsman = Batsmanfactories.getBatsman(
                "1", 50
        );
        batsmanRepoImp.create(batsman);

        Batsman batsman1 = batsmanRepoImp.read(batsman.getBatsmanId());
        assertEquals(batsman, batsman1);

    }
    @Test
    public void delete() {
        Batsman batsman = Batsmanfactories.getBatsman(
                "1", 50
        );
        batsmanRepoImp.create(batsman);
        batsmanRepoImp.delete(batsman.getBatsmanId());
    }

    @Test
    public void update() {
        Batsman batsman = Batsmanfactories.getBatsman(
                "1", 50
        );
        batsmanRepoImp.create(batsman);
    }

    @Test
    public void getAll() {
        Set<Batsman> all = this.batsmanRepoImp.getAll();
        System.out.println("In getAll, all = " + all);
    }
}