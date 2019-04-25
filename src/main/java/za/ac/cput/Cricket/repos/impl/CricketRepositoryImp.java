package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.repos.CricketRepos;

import java.util.HashSet;
import java.util.Set;

public class CricketRepositoryImp implements CricketRepos {

    private static CricketRepos repository = null;
    private Set<Cricket> crickets;

    private CricketRepositoryImp() {
        this.crickets = new HashSet<>();
    }

    private Cricket findCricket(String team1) {
        return this.crickets.stream().filter(cricket -> cricket.getTeam1().equals(team1)).findAny().orElse(null);

    }

    public static CricketRepos getRepository(){
        if (repository == null) repository = new CricketRepositoryImp();
        return repository;
    }

    //@Override
    public Cricket create(Cricket cricket) {

        this.crickets.add(cricket);
        return cricket;
    }


    public void delete(Cricket cricket) {
        this.crickets.remove(cricket);
    }


    public Cricket read(final String cricketId) {

        return  findCricket(cricketId);
    }

    @Override
    public Cricket update(Cricket cricket) {
        // find the student to update in the student collection
        // if found, update and save back into the student collection
        return null;
    }

    public Set<Cricket> getAll() {
        return this.crickets;
    }
}

