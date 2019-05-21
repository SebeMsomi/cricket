package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Country;

import static org.junit.Assert.*;

public class CountryfactoryTest {

    @Test
    public void getCountry() {
        String countryName = "South Africe";
        String countryID ="";
        Country c = Countryfactory.getCountry(countryName, countryID);
        Assert.assertNotNull(c.getCounrtyName(), countryID);
        System.out.println(countryID + " " +countryName);
    }
}