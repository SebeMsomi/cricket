package za.ac.cput.Cricket.controller.controllerpackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.factory.members.BowlerFactory;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BowlerControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/bowler";

    @Test
    public void testGetAllStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Test
    public void create() {
        Bowler bowler = BowlerFactory.getBowler("There are three types of Bowlers");
        ResponseEntity<Bowler> postResponse = restTemplate.postForEntity(baseURL + "/create", bowler, Bowler.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Bowler bowler = restTemplate.getForObject(baseURL + "/bowler/" + id, Bowler.class);
        restTemplate.put(baseURL + "/bowlers/" + id, bowler);
        Bowler updatedStudent = restTemplate.getForObject(baseURL + "/bowler/" + id, Bowler.class);
        assertNotNull(updatedStudent);
    }

    @Test
    public void delete() {
        int id = 2;
        Bowler bowler = restTemplate.getForObject(baseURL + "/batsmans/" + id, Bowler.class);
        assertNotNull(bowler);
        restTemplate.delete(baseURL + "/batsmans/" + id);
        try {
            bowler = restTemplate.getForObject(baseURL + "/batsmans/" + id, Bowler.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void read() {

    }

    @Test
    public void getAll() {
    }
}