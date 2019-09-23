package za.ac.cput.Cricket.repos.records.impl;

import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.repos.interfaces.CountryRepo;

import java.util.*;

public class CountryRepoImp implements CountryRepo {
    private static CountryRepoImp repository = null;
    private Map<String, Country> countryMap;

    private CountryRepoImp() {
        this.countryMap = new HashMap<>();
    }

    public static CountryRepo getRepository(){
        if(repository == null) repository = new CountryRepoImp();
        return repository;
    }


    @Override
    public Country create(Country country) {
        this.countryMap.put(country.getCountryID(),country);
        return country;
    }

    @Override
    public Country update(Country country) {
        this.countryMap.replace(country.getCountryID(),country);
        return this.countryMap.get(country.getCountryID());
    }

    @Override
    public void delete(String s) {
        this.countryMap.remove(s);
    }

    @Override
    public Country read(String s) {
        return this.countryMap.get(s);
    }

    public Set<Country> getAll(){
        Collection<Country> countries = this.countryMap.values();
        Set<Country> set = new HashSet<>();
        set.addAll(countries);
        return set;
    }
}
