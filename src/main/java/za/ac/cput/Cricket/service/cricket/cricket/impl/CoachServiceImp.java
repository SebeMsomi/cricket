package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.Coach;
import za.ac.cput.Cricket.repos.impl.CoachRepoImp;
import za.ac.cput.Cricket.repos.interfaces.CoachRepo;
import za.ac.cput.Cricket.service.cricket.serviceInterface.CoachService;

import java.util.Set;

public class CoachServiceImp implements CoachService{

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
