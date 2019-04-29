package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Rules;

import java.util.HashSet;
import java.util.Set;

public class RulesRepoImp {
    private static RulesRepoImp repository = null;
    private Set<Rules> rulesSet;

    private RulesRepoImp(){
        this.rulesSet = new HashSet<>();
    }

    public static RulesRepoImp getRepository(){
        if (repository == null) repository = new RulesRepoImp();
        return repository;
    }


    public Rules create(Rules rules){
        this.rulesSet.add(rules);
        return rules;
    }

    public Rules read(String rulesId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String rulesId) {
        // find the course, delete it if it exist
    }

    public Rules update(Rules rules){
        // find the course, update it and delete it if it exists
        return rules;
    }


    public Set<Rules> getAll(){
        return this.rulesSet;
    }
}
