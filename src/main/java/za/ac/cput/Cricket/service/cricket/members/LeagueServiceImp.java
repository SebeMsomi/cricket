package za.ac.cput.Cricket.service.cricket.members;

import za.ac.cput.Cricket.domain.records.League;
import za.ac.cput.Cricket.repos.records.LeagueRepoImp;
import za.ac.cput.Cricket.repos.interfaces.LeagueRepo;
import za.ac.cput.Cricket.service.cricket.serviceInterface.LeagueService;

import java.util.Set;

public class LeagueServiceImp implements LeagueService{

    private LeagueServiceImp service = null;
    private LeagueRepo repository;

    private LeagueServiceImp(){
        this.repository =  LeagueRepoImp.getRepository();
    }
    public LeagueService getService(){
        if (service == null) service = new LeagueServiceImp();
        return service;
    }


    public League create(League facilities) {
        return this.repository.create(facilities);
    }


    public League update(League facilities) {
        return this.repository.update(facilities);
    }


    public void delete(String s) {
        this.repository.delete(s);
    }


    public League read(String s) {
        return this.repository.read(s);
    }


    public Set<League> getAll() {
        return this.repository.getAll();
    }
}
