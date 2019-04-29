package za.ac.cput.Cricket.repos.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.repos.CricketRepos;

import java.util.Set;

import static org.junit.Assert.*;

public class CricketRepositoryImpTest {
    private CricketRepos repository;

    @Before
    public void setUp() throws Exception {
        this.repository = CricketRepositoryImp.getRepository();
    }

    @After
    public void tearDown() throws Exception {
    }

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