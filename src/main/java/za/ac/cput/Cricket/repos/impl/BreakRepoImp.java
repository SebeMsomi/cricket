package za.ac.cput.Cricket.repos.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.Break;
import za.ac.cput.Cricket.repos.interfaces.BreakRepo;

import java.util.*;

@Repository("Cricket")
public class BreakRepoImp implements BreakRepo{
    private static BreakRepoImp repository = null;
    private Map<String, Break> breaks;

    private BreakRepoImp() {
        this.breaks = new HashMap<>();

    }
    public static BreakRepo getRepository(){
        if(repository == null) repository = new BreakRepoImp();
        return repository;
    }

    public Break create(Break break1){
        this.breaks.put(break1.getType(),break1);
        return break1;
    }

    public Break update(Break break1) {
        this.breaks.replace(break1.getType(),break1);
        return this.breaks.get(break1.getType());
    }

    public void delete(String breakId) {
        this.breaks.remove(breakId);
    }

    @Override
    public Break read(String s) {
        return this.breaks.get(s);
    }

    public Set<Break> getAll(){
        Collection<Break> breakss = this.breaks.values();
        Set<Break> set = new HashSet<>();
        set.addAll(breakss);
        return set;
    }

}
