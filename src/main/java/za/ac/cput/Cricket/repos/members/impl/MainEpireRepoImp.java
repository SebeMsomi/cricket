package za.ac.cput.Cricket.repos.members.impl;

import za.ac.cput.Cricket.domain.members.MainEmpire;
import za.ac.cput.Cricket.repos.members.MainEmpireRepo;

import java.util.*;

public class MainEpireRepoImp implements MainEmpireRepo {
    private static MainEpireRepoImp repository = null;
    private Map<String, MainEmpire> mainEmpires;

    private MainEpireRepoImp(){
        this.mainEmpires = new HashMap<>();
    }

    public static MainEmpireRepo getRepository(){
        if (repository == null) repository = new MainEpireRepoImp();
        return repository;
    }

    public MainEmpire create(MainEmpire mainEmpire){
        this.mainEmpires.put(mainEmpire.getRole(),mainEmpire);
        return mainEmpire;
    }

    public MainEmpire read(String s){
        return this.mainEmpires.get(s);

    }

    public void delete(String s) {
        this.mainEmpires.remove(s);    }

    public MainEmpire update(MainEmpire mainEmpire){
        this.mainEmpires.replace(mainEmpire.getRole(),mainEmpire);
        return this.mainEmpires.get(mainEmpire.getRole());

    }


    public Set<MainEmpire> getAll(){
        Collection<MainEmpire> lunches1 = this.mainEmpires.values();
        Set<MainEmpire> set = new HashSet<>();
        set.addAll(lunches1);
        return set;
    }

}
