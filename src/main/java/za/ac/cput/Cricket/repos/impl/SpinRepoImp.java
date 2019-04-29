package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Spin;

import java.util.HashSet;
import java.util.Set;

public class SpinRepoImp {
    private static SpinRepoImp repository = null;
    private Set<Spin> spinSet;

    private SpinRepoImp(){
        this.spinSet = new HashSet<>();
    }

    public static SpinRepoImp getRepository(){
        if (repository == null) repository = new SpinRepoImp();
        return repository;
    }


    public Spin create(Spin spin){
        this.spinSet.add(spin);
        return spin;
    }

    public Spin read(String spinId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String spinId) {
        // find the course, delete it if it exist
    }

    public Spin update(Spin spin){
        // find the course, update it and delete it if it exists
        return spin;
    }


    public Set<Spin> getAll(){
        return this.spinSet;
    }
}
