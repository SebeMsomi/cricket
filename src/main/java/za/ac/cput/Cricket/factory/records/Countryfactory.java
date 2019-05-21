package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Country;

public class Countryfactory {
    public static Country getCountry(String countryName, String countryID)
    {
        return new Country.Builder()
                .countryName(countryName)
                .countryID(countryID)
                .Build();
    }
}
