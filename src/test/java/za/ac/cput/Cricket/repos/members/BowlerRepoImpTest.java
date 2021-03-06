package za.ac.cput.Cricket.repos.members;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.factory.members.BowlerFactory;
import za.ac.cput.Cricket.repos.members.impl.BowlerRepoImp;

import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class BowlerRepoImpTest {

    @Autowired
    private BowlerRepoImp repository;


    @Test
    public void create() {
        Bowler bowler = BowlerFactory.getBowler("There are three types of bowlers");
        repository.create(bowler);
        assertNotNull(repository.getAll());
    }

    @Test
    public void read() {
        Bowler bowler = BowlerFactory.getBowler("There are three types of bowlers");

        repository.create(bowler);
        Bowler bowler1 = repository.read(bowler.getType());

        assertEquals(bowler, bowler1);
    }

    @Test
    public void delete() {
        Bowler bowler = BowlerFactory.getBowler("");
        repository.create(bowler);


        //checks that its not empty
        assertNotNull(repository.getAll());

        repository.delete(bowler.getType());

        //check if its deleted
        Bowler bowler1 = repository.read(bowler.getType());

        assertNull(bowler1);//will pass if its not there
    }

    @Test
    public void update() {
        Bowler cricket = BowlerFactory.getBowler("There are three types of bowlers");

        repository.create(cricket);

        Bowler bowler1 = BowlerFactory.getBowler("Bowlers include fast medium and spin");
        bowler1.getType();
        repository.update(bowler1);
    }

    @Test
    public void getAll() {
        Set<Bowler> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}