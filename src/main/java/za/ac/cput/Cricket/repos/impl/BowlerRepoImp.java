package za.ac.cput.Cricket.repos.impl;
import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.domain.Team;
import za.ac.cput.Cricket.repos.interfaces.BowlerRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class BowlerRepoImp implements BowlerRepo{

    private static BowlerRepoImp repository = null;
    private Map<String, Bowler> bowlers;

    private BowlerRepoImp(){
        this.bowlers =  (Map<String, Bowler>) new HashSet<Object>();
    }

    public static BowlerRepo getRepository(){
        if (repository == null) repository = new BowlerRepoImp();
        return repository;
    }

    public Bowler create(Bowler bowler){
        this.bowlers.put(bowler.toString(),bowler);
        return bowler;
    }

    public Bowler read(String batId){
        return this.bowlers.get(batId);
    }

    public void delete(String batsmanId) {
        this.bowlers.remove(batsmanId);
    }

    public Bowler update(Bowler batsman) {
        this.bowlers.replace(batsman.toString(),batsman);
        return this.bowlers.get(batsman.toString());
    }

    public Set<Bowler> getAll1() {
        Collection<Bowler> bowlers = this.bowlers.values();
        Set<Bowler> set = new HashSet<>();
        set.addAll(bowlers);
        return set;
    }


    @Override
    public Set<Team> getAll() {
        return null;
    }
}
