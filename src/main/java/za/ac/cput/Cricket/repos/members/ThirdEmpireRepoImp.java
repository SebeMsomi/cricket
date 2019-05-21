package za.ac.cput.Cricket.repos.members;

import za.ac.cput.Cricket.domain.members.ThirdEmpire;

import java.util.HashSet;
import java.util.Set;

public class ThirdEmpireRepoImp {
    private static ThirdEmpireRepoImp repository = null;
    private Set<ThirdEmpire> drinkSet;

    private ThirdEmpireRepoImp(){
        this.drinkSet = new HashSet<>();
    }

    public static ThirdEmpireRepoImp getRepository(){
        if (repository == null) repository = new ThirdEmpireRepoImp();
        return repository;
    }


    public ThirdEmpire create(ThirdEmpire thirdEmpire){
        this.drinkSet.add(thirdEmpire);
        return thirdEmpire;
    }

    public ThirdEmpire read(String tId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String tId) {
        // find the course, delete it if it exist
    }

    public ThirdEmpire update(ThirdEmpire thirdEmpire){
        // find the course, update it and delete it if it exists
        return thirdEmpire;
    }


    public Set<ThirdEmpire> getAll(){
        return this.drinkSet;
    }
}
