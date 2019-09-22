package za.ac.cput.Cricket.service.members.impl;

import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.repos.members.impl.CoachRepoImp;
import za.ac.cput.Cricket.repos.members.CoachRepo;
import za.ac.cput.Cricket.service.members.CoachService;

import java.util.Set;

public class CoachServiceImp implements CoachService {

    private CoachRepo repository;
    private CoachServiceImp service = null;


    private CoachServiceImp(){
        this.repository = CoachRepoImp.getRepository();
    }
    public CoachService getService(){
        if (service == null) service = new CoachServiceImp();
        return service;
    }


    public Coach create(Coach coach) {
        return repository.create(coach);
    }


    public Coach update(Coach coach) {
        return repository.update(coach);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Coach read(String s) {
        return repository.read(s);
    }

    public Set<Coach> getAll() {
        return repository.getAll();
    }
}
