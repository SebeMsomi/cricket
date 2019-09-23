package za.ac.cput.Cricket.controller.controllerpackage.record;

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
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.factory.records.ResultFactory;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResultControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/results";

    @Before
    public void result(){

        Results results = ResultFactory.getResults("1","The protea won by 5 wickets");

        restTemplate.postForEntity(baseURL + "/new", results, Results.class);

    }
    @Test
    public void a_create() {

        Results results = ResultFactory.getResults("1","The protea won by 2 wickets");
        results.setResultsID("1");
        ResponseEntity<Results> postResponse = restTemplate.postForEntity(baseURL + "/new",results, Results.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }
    @Test
    public void findById() {

        Results res = restTemplate.getForObject(baseURL + "/find/Afsd", Results.class);

        assertNull(res);

    }
    @Test
    public void c_update() {


        Results results = ResultFactory.getResults("1","The protea won by 2 wickets");
        results.setResultsID("1");
        ResponseEntity<Results> postResponse = restTemplate.postForEntity(baseURL + "/new", results, Results.class);

        Results reportIn = restTemplate.getForObject(baseURL + "/find/" + "1", Results.class);
        results.getDescription();

        restTemplate.put(baseURL + "/update/" + "1", reportIn);

        Results results1 = restTemplate.getForObject(baseURL + "/update/" + "1", Results.class);

        assertNotNull(results1);

    }

    @Test
    public void delete() {

        String id = "1";
        Results results = restTemplate.getForObject(baseURL + "/find/" + "1", Results.class);
        assertNull(results);

        restTemplate.delete(baseURL + "/delete/" + "Afsd");

        try {
            results = restTemplate.getForObject(baseURL + "/find/" + "Afsd", Results.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getAll", HttpMethod.GET, entity, String.class);

        assertNotNull(response.getBody());

    }

    @Test
    public void whenCorrectCredentialsWillBe200() throws Exception {

        ResponseEntity<String> response = restTemplate.withBasicAuth("user", "user").getForEntity(baseURL + "/getall", String.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        assertEquals(HttpStatus.OK, response.getStatusCode());

    }

    @Test
    public void whenIncorrectCredentialsWillBe401() throws Exception {

        ResponseEntity<String> response = restTemplate.withBasicAuth("users", "users").getForEntity(baseURL + "/getall", String.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());

    }

}
