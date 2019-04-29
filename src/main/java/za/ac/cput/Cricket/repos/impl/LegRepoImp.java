package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Leg;

import java.util.HashSet;
import java.util.Set;

public class LegRepoImp {
    private static LegRepoImp repository = null;
    private Set<Leg> legs;

    private LegRepoImp(){
        this.legs = new HashSet<>();
    }

    public static LegRepoImp getRepository(){
        if (repository == null) repository = new LegRepoImp();
        return repository;
    }


    public Leg create(Leg leg){
        this.legs.add(leg);
        return leg;
    }

    public Leg read(String legId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String legId) {
        // find the course, delete it if it exist
    }

    public Leg update(Leg leg){
        // find the course, update it and delete it if it exists
        return leg;
    }


    public Set<Leg> getAll(){
        return this.legs;
    }
}
