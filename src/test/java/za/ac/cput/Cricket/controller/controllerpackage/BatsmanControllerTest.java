package za.ac.cput.Cricket.controller.controllerpackage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.factory.Batsmanfactories;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BatsmanControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

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
        Batsman batsman = Batsmanfactories.getBatsman(100 , 48);
        ResponseEntity<Batsman> postResponse = restTemplate.postForEntity(baseURL + "/create", batsman, Batsman.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Batsman batsman = restTemplate.getForObject(baseURL + "/batsman/" + id, Batsman.class);
        restTemplate.put(baseURL + "/bastmans/" + id, batsman);
        Batsman updatedStudent = restTemplate.getForObject(baseURL + "/Batsman/" + id, Batsman.class);
        assertNotNull(updatedStudent);
    }

    @Test
    public void delete() {
        int id = 2;
        Batsman batsman = restTemplate.getForObject(baseURL + "/batsmans/" + id, Batsman.class);
        assertNotNull(batsman);
        restTemplate.delete(baseURL + "/batsmans/" + id);
        try {
            batsman = restTemplate.getForObject(baseURL + "/batsmans/" + id, Batsman.class);
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