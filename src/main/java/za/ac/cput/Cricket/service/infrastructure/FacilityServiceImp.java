package za.ac.cput.Cricket.service.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.repos.infrastructure.impl.FacilityRepoImp;
import za.ac.cput.Cricket.repos.infrastructure.FacilityRepo;

import java.util.Set;

public class FacilityServiceImp implements FacilityRepo{
    private FacilityServiceImp service = null;
    private FacilityRepo repository;

    private FacilityServiceImp(){
        this.repository =  FacilityRepoImp.getRepository();
    }
    public FacilityRepo getService(){
        if (service == null) {
           return new FacilityServiceImp();
        }
        return service;
    }


    @Override
    public Facilities create(Facilities facilities) {
        return this.repository.create(facilities);
    }

    @Override
    public Facilities update(Facilities facilities) {
        return this.repository.update(facilities);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Facilities read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Facilities> getAll() {
        return this.repository.getAll();
    }
}
