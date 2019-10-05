package za.ac.cput.Cricket.repos.records;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.CrossOrigin;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.factory.records.ResultFactory;
import za.ac.cput.Cricket.factory.records.ResultsFactory;
import za.ac.cput.Cricket.repos.records.impl.ResultRepoImp;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResultsRepositoryTest {
    @Autowired
    private ResultRepoImp reportitory;


    @Test
    public void create() {

        Results results = ResultFactory.getResults("1",null);
        reportitory.create(results);
        assertNotNull(reportitory.getAll());

    }

    @Test
    public void read() {

        Results results = ResultFactory.getResults("1",null);
        reportitory.create(results);
        assertNotNull(reportitory.getAll());


        Results results1 = reportitory.read(results.getResultsID());

        assertEquals(results, results1);


    }

    @Test
    public void update() {


        Results results = ResultFactory.getResults("1",null);
        reportitory.create(results);
        assertNotNull(reportitory.getAll());

        Results results1 = ResultFactory.getResults("2",null);
        results1.setResultsID(results.getResultsID());
        reportitory.update(results1);

        Results updated = reportitory.read(results.getResultsID());

        assertEquals(results1, updated);

    }

    @Test
    public void delete() {


        Results results = ResultFactory.getResults("1",null);
        reportitory.create(results);
        assertNotNull(reportitory.getAll());

        reportitory.delete(results.getResultsID());

        Results results1 = reportitory.read(results.getResultsID());

        assertNull(results1);


    }
}
