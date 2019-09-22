package za.ac.cput.Cricket.service.members.impl;

import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.repos.members.impl.LegRepoImp;
import za.ac.cput.Cricket.repos.members.LegRepo;
import za.ac.cput.Cricket.service.members.LegService;

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