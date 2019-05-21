package za.ac.cput.Cricket.domain.records;

import za.ac.cput.Cricket.domain.members.Team;

import java.util.Set;

public class Country {
    private String countryID;
    private String counrtyName;

    public Country(){}

    public Country(Builder builder)
    {
        this.counrtyName = builder.countryName;
        this.countryID = builder.countryID;

    }

    public String getCountryID() {
        return countryID;
    }

    public String getCounrtyName() {
        return counrtyName;
    }

    public static class Builder
    {
        private String countryName;
        private String countryID;
        private Set<Team> teams;

        public Builder countryID(String countryID)
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

    @Override
    public String toString() {
        return "Country{" +
                "countryID=" + countryID +
                ", counrtyName='" + counrtyName + '\'' +
                '}';
    }
}
