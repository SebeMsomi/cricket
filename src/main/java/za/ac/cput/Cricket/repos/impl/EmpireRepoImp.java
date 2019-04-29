package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Empire;

import java.util.HashSet;
import java.util.Set;

public class EmpireRepoImp {
    private static EmpireRepoImp repository = null;
    private Set<Empire> empires;

    private EmpireRepoImp(){
        this.empires = new HashSet<>();
    }

    public static EmpireRepoImp getRepository(){
        if (repository == null) repository = new EmpireRepoImp();
        return repository;
    }


    public Empire create(Empire empire){
        this.empires.add(empire);
        return empire;
    }

    public Empire read(String EmpireId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String EmpireId) {
        // find the course, delete it if it exist
    }

    public Empire update(Empire empire){
        // find the course, update it and delete it if it exists
        return empire;
    }


    public Set<Empire> getAll(){
        return this.empires;
    }
}
