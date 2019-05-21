package za.ac.cput.Cricket.service.cricket.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.repos.infrastructure.GroundRepoImp;
import za.ac.cput.Cricket.repos.interfaces.GroundRepo;
import za.ac.cput.Cricket.service.cricket.serviceInterface.GroundService;

import java.util.Set;

public class GroundServiceImp  implements GroundService{
    private GroundServiceImp service = null;
    private GroundRepo repository;

    private GroundServiceImp(){
        this.repository =  GroundRepoImp.getRepository();
    }
    public GroundService getService(){
        if (service == null) service = new GroundServiceImp();
        return service;
    }


    @Override
    public Ground create(Ground facilities) {
        return this.repository.create(facilities);
    }

    @Override
    public Ground update(Ground facilities) {
        return this.repository.update(facilities);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Ground read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Ground> getAll() {
        return this.repository.getAll();
    }
}
