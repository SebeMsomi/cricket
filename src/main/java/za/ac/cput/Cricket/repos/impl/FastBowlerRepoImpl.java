package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Fast;

import java.util.HashSet;
import java.util.Set;

public class FastBowlerRepoImpl {
    private static FastBowlerRepoImpl repository = null;
    private Set<Fast> fasts;

    private FastBowlerRepoImpl(){
        this.fasts = new HashSet<>();
    }

    public static FastBowlerRepoImpl getRepository(){
        if (repository == null) repository = new FastBowlerRepoImpl();
        return repository;
    }


    public Fast create(Fast fast){
        this.fasts.add(fast);
        return fast;
    }

    public Fast read(String fastId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String fastId) {
        // find the course, delete it if it exist
    }

    public Fast update(Fast fast){
        // find the course, update it and delete it if it exists
        return fast;
    }


    public Set<Fast> getAll(){
        return this.fasts;
    }
}
