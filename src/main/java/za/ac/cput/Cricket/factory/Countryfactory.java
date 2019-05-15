package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Country;

public class Countryfactory {
    public static Country getCountry(String countryName, String countryID)
    {
        return new Country.Builder()
                .countryName(countryName)
                .countryID(countryID)
                .Build();
    }
}
