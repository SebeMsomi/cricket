package za.ac.cput.Cricket.repos.infrastructure.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.repos.infrastructure.FacilityRepo;

import java.util.*;

@Repository("FacilityInMemory")
public class FacilityRepoImp implements FacilityRepo {
    private static FacilityRepoImp repository = null;
    private Map<String, Facilities> facilities;

    public FacilityRepoImp(){

        facilities = new HashMap<>();
    }


    public static FacilityRepo getRepository(){
        if (repository == null) {
            return new FacilityRepoImp();
        }
        return repository;
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
    public Set<Facilities> getAll(){
        return new HashSet<>(facilities.values());
    }
}
