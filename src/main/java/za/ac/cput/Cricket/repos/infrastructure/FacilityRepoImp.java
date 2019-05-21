package za.ac.cput.Cricket.repos.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.repos.interfaces.FacilityRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FacilityRepoImp implements FacilityRepo {
    private static FacilityRepoImp repository = null;
    private Map<String, Facilities> facilities;

    private FacilityRepoImp(){
//        this.facilities = (Map<String, Facilities>) new HashSet<Object>();
    }

    public static FacilityRepo getRepository(){
        if (repository == null) repository = new FacilityRepoImp();
        return repository;
    }





    public Set<Facilities> getAll(){
        Collection<Facilities> facilities1 = this.facilities.values();
        Set<Facilities> set = new HashSet<>();
        set.addAll(facilities1);
        return set;
    }

    @Override
    public Facilities create(Facilities facilities) {
        this.facilities.put(facilities.gethotelId(),facilities);
        return facilities;
    }

    @Override
    public Facilities update(Facilities facilities) {
        this.facilities.replace(facilities.gethotelId(),facilities);
        return this.facilities.get(facilities.gethotelId());
    }

    @Override
    public void delete(String s) {
        this.facilities.remove(s);
    }

    @Override
    public Facilities read(String s) {
        return this.facilities.get(s);
    }
}
