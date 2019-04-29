package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.League;

import java.util.HashSet;
import java.util.Set;

public class LeagueRepoImp {
    private static LeagueRepoImp repository = null;
    private Set<League> leagues;

    private LeagueRepoImp(){
        this.leagues = new HashSet<>();
    }

    public static LeagueRepoImp getRepository(){
        if (repository == null) repository = new LeagueRepoImp();
        return repository;
    }


    public League create(League league){
        this.leagues.add(league);
        return league;
    }

    public League read(String leagueId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String leagueId) {
        // find the course, delete it if it exist
    }

    public League update(League drink){
        // find the course, update it and delete it if it exists
        return drink;
    }


    public Set<League> getAll(){
        return this.leagues;
    }

}
