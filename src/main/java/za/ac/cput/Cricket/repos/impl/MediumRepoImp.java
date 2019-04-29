package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Medium;

import java.util.HashSet;
import java.util.Set;

public class MediumRepoImp {
    private static MediumRepoImp repository = null;
    private Set<Medium> mediumSet;

    private MediumRepoImp(){
        this.mediumSet = new HashSet<>();
    }

    public static MediumRepoImp getRepository(){
        if (repository == null) repository = new MediumRepoImp();
        return repository;
    }


    public Medium create(Medium medium){
        this.mediumSet.add(medium);
        return medium;
    }

    public Medium read(String mediumId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String mediumId) {
        // find the course, delete it if it exist
    }

    public Medium update(Medium medium){
        // find the course, update it and delete it if it exists
        return medium;
    }


    public Set<Medium> getAll(){
        return this.mediumSet;
    }
}
