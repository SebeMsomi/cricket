package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Overs;

import java.util.HashSet;
import java.util.Set;

public class OversRepoImp {
    private static OversRepoImp repository = null;
    private Set<Overs> oversSet;

    private OversRepoImp(){
        this.oversSet = new HashSet<>();
    }

    public static OversRepoImp getRepository(){
        if (repository == null) repository = new OversRepoImp();
        return repository;
    }


    public Overs create(Overs overs){
        this.oversSet.add(overs);
        return overs;
    }

    public Overs read(String oversId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String oversId) {
        // find the course, delete it if it exist
    }

    public Overs update(Overs overs){
        // find the course, update it and delete it if it exists
        return overs;
    }


    public Set<Overs> getAll(){
        return this.oversSet;
    }
}
