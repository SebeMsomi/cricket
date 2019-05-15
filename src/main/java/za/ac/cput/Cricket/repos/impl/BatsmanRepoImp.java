package za.ac.cput.Cricket.repos.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.interfaces.BatsmanInterface;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class BatsmanRepoImp implements BatsmanInterface {
    private static BatsmanRepoImp repository = null;
    private Map<String, Batsman> batsmans;

    private BatsmanRepoImp() {
        this.batsmans = (Map<String, Batsman>) new HashSet<Object>();
    }

    public static BatsmanInterface getRepository(){
        if (repository == null) repository = new BatsmanRepoImp();
        return repository;
    }
    public Batsman create(Batsman batsman){
        this.batsmans.put(batsman.toString(),batsman);
        return batsman;
    }

    public Batsman read(String batId){
        return this.batsmans.get(batId);
    }

    public void delete(String batsmanId) {
        this.batsmans.remove(batsmanId);
    }

    public Batsman update(Batsman batsman) {
        this.batsmans.replace(batsman.toString(),batsman);
        return this.batsmans.get(batsman.toString());
    }

    public Set<Batsman> getAll() {
        Collection<Batsman> batsmans = this.batsmans.values();
        Set<Batsman> set = new HashSet<>();
        set.addAll(batsmans);
        return set;
    }
}
