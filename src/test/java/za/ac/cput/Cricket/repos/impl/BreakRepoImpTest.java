package za.ac.cput.Cricket.repos.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.Break;
import za.ac.cput.Cricket.factory.BreakFactory;
import za.ac.cput.Cricket.repos.interfaces.BreakRepo;

import java.util.Set;

import static org.junit.Assert.*;

public class BreakRepoImpTest {
    @Autowired
    private BreakRepo repository;
    private String breakid = null;

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Break aBreak = BreakFactory.getBreak("two type of breaks");
        repository.create(aBreak);
        assertNotNull(repository.getAll());

    }


    @Test
    public void read() {
        Break aBreak = BreakFactory.getBreak("ProteaAustalia");
        repository.create(aBreak);

        Break aBreak1 = repository.read(aBreak.getType());

        assertEquals(aBreak, aBreak1);
    }

    @Test
    public void update() {
        Break cricket = BreakFactory.getBreak("ProteaAustalia");
        repository.create(cricket);

        Break cricketupdate = BreakFactory.getBreak("West Indies");
        cricketupdate.getType();
        repository.update(cricketupdate);
    }

    @Test
    public void delete() {
        //Create a admin staff and add to set
        Break aBreak = BreakFactory.getBreak("ProteaAustalia");
        repository.create(aBreak);


        //checks that its not empty
        assertNotNull(repository.getAll());

        repository.delete(aBreak.getType());

        //check if its deleted
        Break aBreak1 = repository.read(aBreak.getType());

        assertNull(aBreak1);//will pass if its not there
    }

    @Test
    public void getAll() {
        Set<Break> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}