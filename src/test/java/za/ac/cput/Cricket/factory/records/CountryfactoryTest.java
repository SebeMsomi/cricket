package za.ac.cput.Cricket.factory.records;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.records.Country;

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