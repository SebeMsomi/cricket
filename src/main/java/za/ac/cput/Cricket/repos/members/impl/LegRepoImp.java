package za.ac.cput.Cricket.repos.members.impl;

import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.repos.members.LegRepo;

import java.util.*;

public class LegRepoImp implements LegRepo{
    private static LegRepoImp repository = null;
    private Map<String, Leg> legs;

    private LegRepoImp(){
        this.legs = new HashMap<>();
    }

    public static LegRepo getRepository(){
        if (repository == null) repository = new LegRepoImp();
        return repository;
    }


    public Leg create(Leg leg){
        this.legs.put(leg.getRole(),leg);
        return leg;
    }

    public Leg read(String s){
        return this.legs.get(s);

    }

    public void delete(String s) {
        this.legs.remove(s);    }

    public Leg update(Leg leg){
        this.legs.replace(leg.getRole(),leg);
        return this.legs.get(leg.getRole());

    }


    public Set<Leg> getAll(){
        Collection<Leg> legs1 = this.legs.values();
        Set<Leg> set = new HashSet<>();
        set.addAll(legs1);
        return set;
    }
}
