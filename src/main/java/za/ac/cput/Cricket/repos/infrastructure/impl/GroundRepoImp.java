package za.ac.cput.Cricket.repos.infrastructure.impl;

import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.repos.infrastructure.GroundRepo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroundRepoImp implements GroundRepo {
    private static GroundRepoImp repository = null;
    private Map<String, Ground> grounds;


    public static GroundRepoImp getRepository(){
        if (repository == null) repository = new GroundRepoImp();
        return repository;
    }


    @Override
    public Ground create(Ground ground) {
        grounds.put(ground.getGroundId(),ground);
        return ground;
    }

    @Override
    public Ground read(String id) {
        return grounds.get(id);
    }

    @Override
    public Ground update(Ground ground) {

        grounds.replace(ground.getGroundId(), ground);
        return grounds.get(ground.getGroundId());
    }

    @Override
    public void delete(String id) {
        grounds.remove(id);
    }

    @Override
    public Set<Ground> getAll() {
        return new HashSet<>(grounds.values());
    }

}
