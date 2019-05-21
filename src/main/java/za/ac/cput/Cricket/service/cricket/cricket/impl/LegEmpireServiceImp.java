package za.ac.cput.Cricket.service.cricket.cricket.impl;

import za.ac.cput.Cricket.domain.Leg;
import za.ac.cput.Cricket.repos.impl.LegRepoImp;
import za.ac.cput.Cricket.repos.interfaces.LegRepo;
import za.ac.cput.Cricket.service.cricket.serviceInterface.LegService;

import java.util.Set;

public class LegEmpireServiceImp implements LegService {
    private LegEmpireServiceImp service = null;
    private LegRepo repository;

    private LegEmpireServiceImp() {
        this.repository = LegRepoImp.getRepository();
    }

    public LegService getService() {
        if (service == null) service = new LegEmpireServiceImp();
        return service;
    }


    @Override
    public Leg create(Leg leg) {
        return this.repository.create(leg);
    }

    @Override
    public Leg update(Leg leg) {

            return this.repository.update(leg);
        }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Leg read(String s) {
        return this.repository.read(s);
    }

    public Set<Leg> getAll () {
        return this.repository.getAll();
    }
}