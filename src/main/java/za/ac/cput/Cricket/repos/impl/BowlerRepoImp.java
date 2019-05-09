package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Bowler;

import java.util.HashSet;
import java.util.Set;

public class BowlerRepoImp {
    private static BowlerRepoImp repository = null;
    private Set<Bowler> bowlers;

    private BowlerRepoImp(){
        this.bowlers = new HashSet<>();
    }

    public static BowlerRepoImp getRepository(){
        if (repository == null) repository = new BowlerRepoImp();
        return repository;
    }

    private Bowler findBowler(String bowl) {
        return this.bowlers.stream().filter(bowler -> bowler.getType().equals(bowl)).findAny().orElse(null);
    }

    public Bowler create(Bowler bowler){
        this.bowlers.add(bowler);
        return bowler;
    }

    public Bowler read(String bowl){
        Bowler bowler = findBowler(bowl);
        if(bowler != null) {

            return findBowler(bowl);
        }
        else{
            return null;
        }
    }

    public void delete(String bowlerId) {

        if (bowlers.contains(bowlerId))
        {
            bowlers.remove(bowlerId);
        }
    }

    public Bowler update(String bowl, Bowler bowler){
        Bowler bowler1 = findBowler(bowl);
        if(bowlers.contains(bowler))
        {
            bowlers.remove(bowler);
            bowlers.add(bowler);
        }
        return bowler1;
    }


    public Set<Bowler> getAll(){
        return this.bowlers;
    }

}
