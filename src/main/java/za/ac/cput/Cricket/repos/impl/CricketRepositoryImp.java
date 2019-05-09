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



    public static CricketRepos getRepository(){
        if (repository == null) repository = new CricketRepositoryImp();
        return repository;
    }

    //@Override
    public Cricket create(Cricket cricket) {

        this.crickets.add(cricket);
        return cricket;
    }


    /*public void delete(Cricket cricket) {
        this.crickets.remove(cricket);
    }*/

    private Cricket findCricket(String team1) {
        return this.crickets.stream().filter(cricket -> cricket.getTeam1().equals(team1)).findAny().orElse(null);

    }
    public Cricket read(final String cricketId) {
        Cricket cricket = findCricket(cricketId);

        if(cricket != null) {

            return findCricket(cricketId);
        }
        else{
            return null;
        }
    }


    public Cricket update(Cricket cricket) {
    Cricket cricket1 = findCricket(cricket.getCricketId());
        if(crickets.contains(cricket1))
        {
            crickets.remove(cricket1);
            crickets.add(cricket);
        }
        return cricket1;
    }

    @Override
    public void delete(String id) {
        Cricket cricket = findCricket(id);
        crickets.remove(cricket);

    }

    public Set<Cricket> getAll() {
        return this.crickets;
    }
}

