package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Country;

public class Countryfactory {
    public static Country getCountry(String countryName, int countryID)
    {
        return new Country.Builder()
                .countryName("INDIA" + "PROTEA")
                .countryID(+27)
                .Build();
    }
}
