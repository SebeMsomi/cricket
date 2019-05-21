package za.ac.cput.Cricket.repos.members;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.factory.members.CoachFactory;
import za.ac.cput.Cricket.repos.interfaces.CoachRepo;

import java.util.Set;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)

public class CoachRepoImpTest {


    private CoachRepo repository;


    private String cricketId = null;

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        Coach coach = CoachFactory.getCoach("Sebe Msomi", 25, "15 years", "s1");

        repository.create(coach);
        assertNotNull(repository.getAll());

    }


    @Test
    public void read() {
        Coach coach = CoachFactory.getCoach("Sebe Msomi", 25, "15 years", "s1");
        repository.create(coach);

        Coach coach1 = repository.read(coach.getCoachId());

        assertEquals(coach, coach1);
    }

    @Test
    public void update() {
        Coach cricket = CoachFactory.getCoach("Sebe Msomi", 25, "15 years", "s1");
        repository.create(cricket);

        Coach coach = CoachFactory.getCoach("Sebe Paa", 15, "10 years", "1");
        coach.getCoachId();
        repository.update(coach);
    }

    @Test
    public void delete() {
        //Create a admin staff and add to set
        Coach coach = CoachFactory.getCoach("Sebe Msomi", 25, "15 years", "s1");
        repository.create(coach);


        //checks that its not empty
        assertNotNull(repository.getAll());

        repository.delete(coach.getCoachId());

        //check if its deleted
        Coach coachi = repository.read(coach.getCoachId());

        assertNull(coachi);//will pass if its not there
    }

    @Test
    public void getAll() {
        Set<Coach> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}