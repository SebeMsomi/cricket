package za.ac.cput.Cricket.repos.impl;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.repos.interfaces.CricketRepos;

import java.util.Set;

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
        this.repository.create(null);
        Assert.assertEquals(1, null);
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete1() {
    }

    @Test
    public void getAll() {
        Set<Cricket> crickets = this.repository.getAll();
        Assert.assertEquals(1, crickets.size());
    }
}