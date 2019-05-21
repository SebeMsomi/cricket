package za.ac.cput.Cricket.repos.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.repos.interfaces.GroundRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroundRepoImp implements GroundRepo{
    private static GroundRepoImp repository = null;
    private Map<String, Ground> grounds;

    private GroundRepoImp(){
        this.grounds = (Map<String, Ground>) new HashSet<Object>();
    }

    public static GroundRepo getRepository(){
        if (repository == null) repository = new GroundRepoImp();
        return repository;
    }


    @Override
    public Ground create(Ground ground) {
        this.grounds.put(ground.getGroundId(),ground);
        return ground;
    }

    public Ground read(String groundId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String groundId) {
        // find the course, delete it if it exist
    }

    public Ground update(Ground ground){
        // find the course, update it and delete it if it exists
        return ground;
    }


    public Set<Ground> getAll(){
        Collection<Ground> coaches1 = this.grounds.values();
        Set<Ground> set = new HashSet<>();
        set.addAll(coaches1);
        return set;

    }
}
