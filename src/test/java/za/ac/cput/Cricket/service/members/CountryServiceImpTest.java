package za.ac.cput.Cricket.service.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.factory.records.Countryfactory;
import za.ac.cput.Cricket.repos.records.CountryRepoImp;
import za.ac.cput.Cricket.service.records.CountryServiceImp;

import java.util.Set;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceImpTest {
    private CountryRepoImp repository;
    private Country country;

    private Country getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Autowired
    private CountryServiceImp countryServiceImp;


    @Test
    public void create() {

        Country admin = Countryfactory.getCountry("RSA", "1");
        countryServiceImp.create(admin);

        assertNotNull(countryServiceImp.getAll());

    }

    @Test
    public void read() {

        //Create a admin staff and add to set
        Country admin = Countryfactory.getCountry("RSA", "1");
        countryServiceImp.create(admin);

        //retrieve the adminStaff
        Country adminInSet = countryServiceImp.read(country.getCountryID());

        assertEquals(admin, adminInSet);

    }

    @Test
    public void update() {

        //Create a admin staff and add to set
        Country admin = Countryfactory.getCountry("RSA", "1");
        countryServiceImp.create(admin);

        //updated version
      /*  Country adminUpdate = Countryfactory.getCountry("RSA","1");
        adminUpdate.setEmployeeId(admin.getEmployeeId());
        administrationService.update(adminUpdate);*/

        //get the updated version
        Country updatedVersion = countryServiceImp.read(country.getCountryID());

        assertNotNull(updatedVersion);

    }

    @Test
    public void delete() {

        //Create a admin staff and add to set
        Country country = Countryfactory.getCountry("RSA", "1");
        countryServiceImp.create(country);

        //checks that its not empty
        assertNotNull(countryServiceImp.getAll());

        countryServiceImp.delete(country.getCountryID());
        //check if its deleted
        Country updatedVersion = countryServiceImp.read(country.getCountryID());

        assertNull(updatedVersion);//will pass if its not there

    }
}