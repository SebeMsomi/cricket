package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Medium;
import za.ac.cput.Cricket.repos.interfaces.MediumRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MediumRepoImp implements MediumRepo{
    private static MediumRepoImp repository = null;
    private Map<String, Medium> mediumSet;

    private MediumRepoImp(){
        this.mediumSet = (Map<String, Medium>) new HashSet<Object>();
    }

    public static MediumRepo getRepository(){
        if (repository == null) repository = new MediumRepoImp();
        return repository;
    }

    public Medium create(Medium medium){
        this.mediumSet.put(medium.getSpeed(),medium);
        return medium;
    }

    public Medium read(String s){
        return this.mediumSet.get(s);

    }

    public void delete(String s) {
        this.mediumSet.remove(s);    }

    public Medium update(Medium leg){
        this.mediumSet.replace(leg.getSpeed(),leg);
        return this.mediumSet.get(leg.getSpeed());

    }


    public Set<Medium> getAll(){
        Collection<Medium> legs1 = this.mediumSet.values();
        Set<Medium> set = new HashSet<>();
        set.addAll(legs1);
        return set;
    }
}
