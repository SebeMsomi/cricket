package za.ac.cput.Cricket.repos.records;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.repos.interfaces.CountryRepo;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class CountryRepoImpTest {

    @Autowired
    private CountryRepo repository;
    private String cricketId = null;

}