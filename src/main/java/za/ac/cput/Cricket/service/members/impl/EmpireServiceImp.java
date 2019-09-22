package za.ac.cput.Cricket.service.members.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.repos.members.impl.EmpireRepoImp;
import za.ac.cput.Cricket.repos.members.EmpireRepo;
import za.ac.cput.Cricket.service.members.EmpireService;

import java.util.Set;

public class EmpireServiceImp implements EmpireService {
    @Autowired
    private EmpireServiceImp service = null;
    private EmpireRepo repository;
    private EmpireServiceImp(){
        this.repository =  EmpireRepoImp.getRepository();
    }
    public EmpireService getService(){
        if (service == null) service = new EmpireServiceImp();
        return service;
    }


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
