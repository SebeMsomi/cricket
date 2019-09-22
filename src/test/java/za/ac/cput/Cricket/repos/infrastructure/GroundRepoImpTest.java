package za.ac.cput.Cricket.repos.infrastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.factory.infrastructure.GroundFactory;
import za.ac.cput.Cricket.repos.infrastructure.impl.GroundRepoImp;

import java.util.Set;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GroundRepoImpTest {

    @Autowired
    private GroundRepoImp repository;

    @Test
    public void create() {
        Ground ground = GroundFactory.getGround(400,700,"1");
        repository.create(ground);
        Assert.assertNotNull(repository.getAll());
    }

    @Test
    public void read() {

    }

    @Test
    public void delete() {

    }

    @Test
    public void update() {

    }

    @Test
    public void getAll() {
        Set<Ground> grounds = this.repository.getAll();
        System.out.println("In get all," + grounds);
    }
}