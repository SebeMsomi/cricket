package za.ac.cput.Cricket.repos.members.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.repos.members.BatsmanInterface;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class BatsmanRepoImp implements BatsmanInterface {

    private static BatsmanRepoImp repository = null;
    private Map<String, Batsman> batsmans;



    public static BatsmanRepoImp getRepository(){
        if (repository == null) {
           return new BatsmanRepoImp();
        }
        return repository;
    }

    @Override
    public Batsman create(Batsman batsman){
        this.batsmans.put(batsman.getBatsmanId(),batsman);
        return batsman;
    }

    @Override
    public Batsman read(String batId){
        return this.batsmans.get(batId);
    }

    @Override
    public void delete(String batsmanId) {
        this.batsmans.remove(batsmanId);
    }

    @Override
    public Batsman update(Batsman batsman) {
        this.batsmans.replace(batsman.getBatsmanId(),batsman);
        return this.batsmans.get(batsman.getBatsmanId());
    }

    @Override
    public Set<Batsman> getAll() {
        return new HashSet<>(batsmans.values());
    }
}
