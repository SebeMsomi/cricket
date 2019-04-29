package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Facilities;

import java.util.HashSet;
import java.util.Set;

public class FacilityRepoImp {
    private static FacilityRepoImp repository = null;
    private Set<Facilities> facilities;

    private FacilityRepoImp(){
        this.facilities = new HashSet<>();
    }

    public static FacilityRepoImp getRepository(){
        if (repository == null) repository = new FacilityRepoImp();
        return repository;
    }


    public Facilities create(Facilities drink){
        this.facilities.add(drink);
        return drink;
    }

    public Facilities read(String drinkId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String coachID) {
        // find the course, delete it if it exist
    }

    public Facilities update(Facilities drink){
        // find the course, update it and delete it if it exists
        return drink;
    }


    public Set<Facilities> getAll(){
        return this.facilities;
    }
}
