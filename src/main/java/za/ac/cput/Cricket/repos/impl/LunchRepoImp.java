package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Lunch;

import java.util.HashSet;
import java.util.Set;

public class LunchRepoImp {
    private static LunchRepoImp repository = null;
    private Set<Lunch> lunches;

    private LunchRepoImp(){
        this.lunches = new HashSet<>();
    }

    public static LunchRepoImp getRepository(){
        if (repository == null) repository = new LunchRepoImp();
        return repository;
    }


    public Lunch create(Lunch lunch){
        this.lunches.add(lunch);
        return lunch;
    }

    public Lunch read(String lunchId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String lunchId) {
        // find the course, delete it if it exist
    }

    public Lunch update(Lunch lunch){
        // find the course, update it and delete it if it exists
        return lunch;
    }


    public Set<Lunch> getAll(){
        return this.lunches;
    }
}
