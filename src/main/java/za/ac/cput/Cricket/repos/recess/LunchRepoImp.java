package za.ac.cput.Cricket.repos.recess;

import za.ac.cput.Cricket.domain.recess.Lunch;
import za.ac.cput.Cricket.repos.interfaces.LunchRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LunchRepoImp implements LunchRepo{
    private static LunchRepoImp repository = null;
    private Map<String, Lunch> lunches;

    private LunchRepoImp(){
        this.lunches = (Map<String, Lunch>) new HashSet<Object>();
    }

    public static LunchRepo getRepository(){
        if (repository == null) repository = new LunchRepoImp();
        return repository;
    }



    public Lunch create(Lunch lunch){
        this.lunches.put(lunch.getTime(),lunch);
        return lunch;
    }

    public Lunch read(String s){
        return this.lunches.get(s);

    }

    public void delete(String s) {
        this.lunches.remove(s);    }

    public Lunch update(Lunch lunch){
        this.lunches.replace(lunch.getTime(),lunch);
        return this.lunches.get(lunch.getTime());

    }


    public Set<Lunch> getAll(){
        Collection<Lunch> lunches1 = this.lunches.values();
        Set<Lunch> set = new HashSet<>();
        set.addAll(lunches1);
        return set;
    }
}
