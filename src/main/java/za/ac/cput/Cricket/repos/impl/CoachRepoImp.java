package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Coach;

import java.util.HashSet;
import java.util.Set;

public class CoachRepoImp {
    private static CoachRepoImp repository = null;
    private Set<Coach> coachSet;

    private CoachRepoImp(){
        this.coachSet = new HashSet<>();
    }

    public static CoachRepoImp getRepository(){
        if (repository == null) repository = new CoachRepoImp();
        return repository;
    }


    public Coach create(Coach coach){
        this.coachSet.add(coach);
        return coach;
    }

    public Coach read(String coachID){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String coachID) {
        // find the course, delete it if it exist
    }

    public Coach update(Coach coach){
        // find the course, update it and delete it if it exists
        return coach;
    }


    public Set<Coach> getAll(){
        return this.coachSet;
    }
}
