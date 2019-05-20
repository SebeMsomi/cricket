package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.Empire;
import za.ac.cput.Cricket.repos.interfaces.EmpireRepo;

import java.util.Set;

public class EmpireServiceImp {
    @Autowired
    private EmpireRepo repository;


    public Empire create(Empire empire) {
        return repository.create(empire);
    }


    public Empire update(Empire empire) {
        return repository.update(empire);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Empire read(String s) {
        return repository.read(s);
    }

    public Set<Empire> getAll() {
        return repository.getAll();
    }
}
