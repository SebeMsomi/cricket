package za.ac.cput.Cricket.repos.records;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.records.Cricket;
import za.ac.cput.Cricket.factory.records.CricketFactory;
import za.ac.cput.Cricket.repos.interfaces.CricketRepos;

import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class CricketRepositoryImpTest {
    @Autowired
    private CricketRepos repository;
    private String cricketId = null;

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Cricket cricket = CricketFactory.getCricket("Protea","Austalia");
        repository.create(cricket);
        assertNotNull(repository.getAll());

    }


    @Test
    public void read() {
        Cricket cricket = CricketFactory.getCricket("Protea","Austalia");
        repository.create(cricket);

        Cricket cricket1 = repository.read(cricket.getCricketId());

        assertEquals(cricket, cricket1);
    }

    @Test
    public void update() {
        Cricket cricket = CricketFactory.getCricket("Protea","Austalia");
        repository.create(cricket);

        Cricket cricketupdate = CricketFactory.getCricket("New Zealand","West Indies");
        cricketupdate.getCricketId();
        repository.update(cricketupdate);
    }

    @Test
    public void delete() {
        //Create a admin staff and add to set
        Cricket cricket = CricketFactory.getCricket("Protea","Austalia");
        repository.create(cricket);


        //checks that its not empty
        assertNotNull(repository.getAll());

        repository.delete(cricket.getCricketId());

        //check if its deleted
        Cricket cricket1 = repository.read(cricket.getCricketId());

        assertNull(cricket1);//will pass if its not there
    }

    @Test
    public void getAll() {
        Set<Cricket> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}