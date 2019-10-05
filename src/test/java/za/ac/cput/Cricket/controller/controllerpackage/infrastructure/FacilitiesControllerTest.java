package za.ac.cput.Cricket.controller.controllerpackage.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.factory.infrastructure.Facilitiesfactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

public class FacilitiesControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL="http://localhost:8080/";

    @Test
    public void create() {
        Facilities facilities = Facilitiesfactory.getCourse(
                "1","Medicine","Medical Aid"
        );
        ResponseEntity<Facilities> responseEntity = restTemplate.postForEntity(baseURL + "/new", facilities, Facilities.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }
    @Test
    public void findById() {


        Facilities facilities = restTemplate.getForObject(baseURL + "/find/1", Facilities.class);

        assertNotNull(facilities);

    }

    @Test
    public void update() {

        int id = 1;
        Facilities appointment = restTemplate.getForObject(baseURL + "/find/" + id, Facilities.class);


        restTemplate.put(baseURL + "/update/" + id, appointment);

        Facilities appointmentUpdated = restTemplate.getForObject(baseURL + "/update/" + id, Facilities.class);

        assertNotNull(appointmentUpdated);

    }
    @Test
    public void delete() {

        int id = 1;
        Facilities facilities = restTemplate.getForObject(baseURL + "/find/" + id, Facilities.class);
        assertNotNull(facilities);

        restTemplate.delete(baseURL + "/delete/" + id);

        try {
            facilities = restTemplate.getForObject(baseURL + "/find/" + id, Facilities.class);
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
