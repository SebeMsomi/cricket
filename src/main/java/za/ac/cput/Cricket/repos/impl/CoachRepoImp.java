package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Coach;
import za.ac.cput.Cricket.repos.interfaces.CoachRepo;

import java.util.*;

public class CoachRepoImp implements CoachRepo{
    private static CoachRepoImp repository = null;
    private Map<String, Coach> coaches;

    private CoachRepoImp() {
        this.coaches = new HashMap<>();
    }

    public static CoachRepo getRepository(){
        if(repository == null) repository = new CoachRepoImp();
        return repository;
    }

    @Override
    public Coach create(Coach coach) {
        this.coaches.put(coach.getCoachId(),coach);
        return coach;
    }

    @Override
    public Coach update(Coach coach) {
        this.coaches.replace(coach.getCoachId(),coach);
        return this.coaches.get(coach.getCoachId());
    }

    @Override
    public void delete(String s) {
        this.coaches.remove(s);
    }

    @Override
    public Coach read(String s) {
        return this.coaches.get(s);
    }


    public Set<Coach> getAll(){
        Collection<Coach> coaches1 = this.coaches.values();
        Set<Coach> set = new HashSet<>();
        set.addAll(coaches1);
        return set;
    }

}
