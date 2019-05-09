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


    public Bowler create(Bowler bowler){
        this.bowlers.add(bowler);
        return bowler;
    }

    public Bowler read(String bowlerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String bowlerId) {
        // find the course, delete it if it exist

        if (bowlers.contains(bowlerId))
        {
            bowlers.remove(bowlers);
        }
    }

    public Bowler update(String id, Bowler bowler){
        // find the course, update it and delete it if it exists
        /*for(int i = 0; i<bowlers.size();i++)
        {
            Bowler b = bowlers.get(i);
            if (b.getType().equals(id))
            {
                bowlers.set(i, bowler);
            }
        }*/

        return bowler;
    }


    public Set<Bowler> getAll(){
        return this.bowlers;
    }

}
