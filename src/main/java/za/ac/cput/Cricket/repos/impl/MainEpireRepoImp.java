package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.MainEmpire;

import java.util.HashSet;
import java.util.Set;

public class MainEpireRepoImp {
    private static MainEpireRepoImp repository = null;
    private Set<MainEmpire> mainEmpires;

    private MainEpireRepoImp(){
        this.mainEmpires = new HashSet<>();
    }

    public static MainEpireRepoImp getRepository(){
        if (repository == null) repository = new MainEpireRepoImp();
        return repository;
    }


    public MainEmpire create(MainEmpire mainEmpire){
        this.mainEmpires.add(mainEmpire);
        return mainEmpire;
    }

    public MainEmpire read(String mainEmpireId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String mainEmpireId) {
        // find the course, delete it if it exist
    }

    public MainEmpire update(MainEmpire mainEmpire){
        // find the course, update it and delete it if it exists
        return mainEmpire;
    }


    public Set<MainEmpire> getAll(){
        return this.mainEmpires;
    }
}
