package za.ac.cput.Cricket.controller.controllerpackage.record;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.Cricket.domain.records.Result;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.factory.records.ResultFactory;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@CrossOrigin(origins = "http://localhost:8080")
public class ResultControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/result";

    @Before
    public void result(){

        Results results = ResultFactory.getResults("1","The protea won by 5 wickets");

        restTemplate.postForEntity(baseURL + "/new", results, Results.class);

    }
    @Test
    public void create() {

        Results results = ResultFactory.getResults("ss","The protea won by 2 wickets");
        results.setResultsID("1");
        ResponseEntity<Results> postResponse = restTemplate.postForEntity(baseURL + "/new",results, Results.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }
    @Test
    public void findById() {

        Results results = restTemplate.getForObject(baseURL + "/find/ss", Results.class);

        Assert.assertNotNull(results);

    }
    @Test
    public void update() {


        Results results = ResultFactory.getResults("ss","The protea won by 2 wickets");
        results.setResultsID("ss");
        ResponseEntity<Results> postResponse = restTemplate.postForEntity(baseURL + "/new", results, Results.class);

        Results reportIn = restTemplate.getForObject(baseURL + "/find/" + "ss", Results.class);
        results.getDescription();

        restTemplate.put(baseURL + "/update/" + "ss", reportIn);

        Results results1 = restTemplate.getForObject(baseURL + "/update/" + "ss", Results.class);

        assertNotNull(results1);

    }

    @Test
    public void delete() {


        Results results = restTemplate.getForObject(baseURL + "/find/" + "ss", Results.class);
        Assert.assertNotNull(results);

        restTemplate.delete(baseURL + "/delete/" + "ss");

        try {
            results = restTemplate.getForObject(baseURL + "/find/" + "ss", Results.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void getAll() {

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getAll", HttpMethod.GET, entity, String.class);

        assertNotNull(response.getBody());

    }

  
}
