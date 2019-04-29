package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Country;
import za.ac.cput.Cricket.repos.CountryRepo;

import java.util.HashSet;
import java.util.Set;

public class CountryRepoImp {
    private static CountryRepoImp repository = null;
    private Set<Country> countrySet;

    private CountryRepoImp() {
        this.countrySet = new HashSet<>();
    }

    public static CountryRepoImp getRepository(){
        if(repository == null) repository = new CountryRepoImp();
        return repository;
    }

    public Country create(Country country){
        this.countrySet.add(country);
        return country;
    }

    public Country read(String countryId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Country update(Country country) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String countryId) {
        //find the student and delete it if it exists

    }

    public Set<Country> getAll(){
        return this.countrySet;
    }
}
