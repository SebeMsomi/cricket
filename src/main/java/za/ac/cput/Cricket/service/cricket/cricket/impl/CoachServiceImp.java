package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.Coach;
import za.ac.cput.Cricket.repos.interfaces.CoachRepo;

import java.util.Set;

public class CoachServiceImp {
    @Autowired
    private CoachRepo repository;


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
