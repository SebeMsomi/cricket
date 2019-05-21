package za.ac.cput.Cricket.repos.records;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.records.Cricket;
import za.ac.cput.Cricket.repos.interfaces.CricketRepos;

import java.util.*;
@Repository
public class CricketRepositoryImp implements CricketRepos {

    private static CricketRepos repository = null;
    private Map<String, Cricket> crickets;

    private CricketRepositoryImp() {
        this.crickets = new HashMap<>();
    }
    public static CricketRepos getRepository(){
        if (repository == null) repository = new CricketRepositoryImp();
        return repository;
    }


    public Set<Cricket> getAll() {
        Collection<Cricket> crickets = this.crickets.values();
        Set<Cricket> set = new HashSet<>();
        set.addAll(crickets);
        return set;
    }

    @Override
    public Cricket create(Cricket cricket) {
        this.crickets.put(cricket.getCricketId(),cricket);
        return cricket;
    }

    @Override
    public Cricket update(Cricket cricket) {
        this.crickets.replace(cricket.getCricketId(),cricket);
        return this.crickets.get(cricket.getCricketId());
    }

    @Override
    public void delete(String s) {
        this.crickets.remove(s);
    }

    @Override
    public Cricket read(String s) {
        return this.crickets.get(s);
    }
}

