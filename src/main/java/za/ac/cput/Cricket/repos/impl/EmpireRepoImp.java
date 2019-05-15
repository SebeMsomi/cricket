package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Empire;
import za.ac.cput.Cricket.repos.interfaces.EmpireRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmpireRepoImp implements EmpireRepo {
    private static EmpireRepoImp repository = null;
    private Map<String, Empire> empires;

    private EmpireRepoImp(){
        this.empires = (Map<String, Empire>) new HashSet<Object>();
    }

    public static EmpireRepo getRepository(){
        if (repository == null) repository = new EmpireRepoImp();
        return repository;
    }

    public Set<Empire> getAll(){
        Collection<Empire> empires1 = this.empires.values();
        Set<Empire> set = new HashSet<>();
        set.addAll(empires1);
        return set;
    }

    @Override
    public Empire create(Empire empire) {
        this.empires.put(empire.getEmpireId(),empire);
        return empire;
    }

    @Override
    public Empire update(Empire empire) {
        this.empires.replace(empire.getEmpireId(),empire);
        return this.empires.get(empire.getEmpireId());
    }

    @Override
    public void delete(String s) {
        this.empires.remove(s);
    }

    @Override
    public Empire read(String s) {
        return this.empires.get(s);
    }
}
