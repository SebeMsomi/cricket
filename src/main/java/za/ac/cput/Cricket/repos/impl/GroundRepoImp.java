package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Ground;

import java.util.HashSet;
import java.util.Set;

public class GroundRepoImp {
    private static GroundRepoImp repository = null;
    private Set<Ground> grounds;

    private GroundRepoImp(){
        this.grounds = new HashSet<>();
    }

    public static GroundRepoImp getRepository(){
        if (repository == null) repository = new GroundRepoImp();
        return repository;
    }


    public Ground create(Ground ground){
        this.grounds.add(ground);
        return ground;
    }

    public Ground read(String groundId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String groundId) {
        // find the course, delete it if it exist
    }

    public Ground update(Ground ground){
        // find the course, update it and delete it if it exists
        return ground;
    }


    public Set<Ground> getAll(){
        return this.grounds;
    }
}
