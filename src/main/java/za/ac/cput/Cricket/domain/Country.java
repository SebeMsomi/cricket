package za.ac.cput.Cricket.domain;

import java.security.KeyStore;
import java.util.Set;

public class Country {
    private int countryID;
    private String counrtyName;

    public Country(){}

    public Country(Builder builder)
    {
        this.counrtyName = builder.countryName;
        this.countryID = builder.countryID;

    }

    public int getCountryID() {
        return countryID;
    }

    public String getCounrtyName() {
        return counrtyName;
    }

    public static class Builder
    {
        private String countryName;
        private int countryID;
        private Set<Team> teams;

        public Builder countryID(int countryID)
        {
            this.countryID = countryID;
            return this;
        }

        public Builder countryName(String countryName)
        {
            this.countryName = countryName;
            return this;
        }

        public Country Build()
        {
            return new Country(this);
        }
    }
}
