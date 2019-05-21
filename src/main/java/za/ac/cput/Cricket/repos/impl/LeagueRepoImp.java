package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.League;
import za.ac.cput.Cricket.repos.interfaces.LeagueRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeagueRepoImp implements LeagueRepo{
    private static LeagueRepoImp repository = null;
    private Map<String, League> leagues;

    private LeagueRepoImp(){
        this.leagues = (Map<String, League>) new HashSet<Object>();
    }

    public static LeagueRepo getRepository(){
        if (repository == null) repository = new LeagueRepoImp();
        return repository;
    }

    public League create(League league){
        this.leagues.put(league.getName(),league);
        return league;
    }

    public League read(String leagueid){
        return this.leagues.get(leagueid);

    }

    public void delete(String leagueid) {
        this.leagues.remove(leagueid);    }

    public League update(League fast){
        this.leagues.replace(fast.getName(),fast);
        return this.leagues.get(fast.getName());

    }


    public Set<League> getAll(){
        Collection<League> leagues1 = this.leagues.values();
        Set<League> set = new HashSet<>();
        set.addAll(leagues1);
        return set;
    }

}
