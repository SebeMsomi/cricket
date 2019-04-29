package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Break;

import java.util.HashSet;
import java.util.Set;

public class BreakRepoImp {
    private static BreakRepoImp repository = null;
    private Set<Break> breaks;

    private BreakRepoImp(){
        this.breaks = new HashSet<>();
    }

    public static BreakRepoImp getRepository(){
        if (repository == null) repository = new BreakRepoImp();
        return repository;
    }


    public Break create(Break breaki){
        this.breaks.add(breaki);
        return breaki;
    }

    public Break read(String breakId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String bowlerId) {
        // find the course, delete it if it exist
    }

    public Break update(Break breaki){
        // find the course, update it and delete it if it exists
        return breaki;
    }


    public Set<Break> getAll(){
        return this.breaks;
    }

}
