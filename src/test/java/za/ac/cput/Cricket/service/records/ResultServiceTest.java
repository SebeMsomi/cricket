package za.ac.cput.Cricket.service.records;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.factory.records.ResultFactory;
import za.ac.cput.Cricket.service.records.impl.ResultServiceImp;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResultServiceTest {
    @Autowired
    private ResultServiceImp service;


    @Test
    public void create() {

        Results results = ResultFactory.getResults("1",null);
        service.create(results);
        assertNotNull(service.getAll());
    }

    @Test
    public void read() {

        Results results = ResultFactory.getResults("1",null);
        service.create(results);
        assertNotNull(service.getAll());

        Results results1 = service.read(results.getResultsID());

        assertEquals(results, results1);


    }

    @Test
    public void update() {


        Results results = ResultFactory.getResults("1",null);
        service.create(results);
        assertNotNull(service.getAll());

        Results results1 = ResultFactory.getResults("2",null);
        results1.setResultsID(results.getResultsID());
        service.update(results1);

        Results updated = service.read(results.getResultsID());

        assertEquals(results1, updated);

    }

    @Test
    public void delete() {



        Results results = ResultFactory.getResults("1",null);
        service.create(results);
        assertNotNull(service.getAll());

        service.delete(results.getResultsID());

        Results results1 = service.read(results.getResultsID());

        assertNull(results1);



    }
}
