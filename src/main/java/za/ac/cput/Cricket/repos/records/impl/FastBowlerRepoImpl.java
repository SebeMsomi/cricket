package za.ac.cput.Cricket.repos.records.impl;

import za.ac.cput.Cricket.domain.records.Fast;
import za.ac.cput.Cricket.repos.interfaces.FastRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FastBowlerRepoImpl implements FastRepo{
    private static FastBowlerRepoImpl repository = null;

    private Map<String, Fast> fasts;

    private FastBowlerRepoImpl(){
        this.fasts = (Map<String, Fast>) new HashSet<Object>();
    }

    public static FastRepo getRepository(){
        if (repository == null) repository = new FastBowlerRepoImpl();
        return repository;
    }


    public Fast create(Fast fast){
        this.fasts.put(fast.getMph(),fast);
        return fast;
    }

    public Fast read(String fastId){
        return this.fasts.get(fastId);

    }

    public void delete(String fastId) {
        this.fasts.remove(fastId);    }

    public Fast update(Fast fast){
        this.fasts.replace(fast.getMph(),fast);
        return this.fasts.get(fast.getMph());

    }


    public Set<Fast> getAll(){
        Collection<Fast> fasts1 = this.fasts.values();
        Set<Fast> set = new HashSet<>();
        set.addAll(fasts1);
        return set;
    }
}
