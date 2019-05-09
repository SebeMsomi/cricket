package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.BatsmanInterface;

import java.util.HashSet;
import java.util.Set;

public class BatsmanRepoImp {
    private static BatsmanInterface repository = null;
    private Set<Batsman> batsmans;

    private BatsmanRepoImp() {
        this.batsmans = new HashSet<>();
    }

    public static BatsmanInterface getRepository(){
        if (repository == null) repository = (BatsmanInterface) new BatsmanRepoImp();
        return repository;
    }

    private Batsman findBatsman(String id) {
        return this.batsmans.stream().filter(batsman -> batsman.equals(id)).findAny().orElse(null);

    }

    public Batsman read(final String id) {
        Batsman batsman = findBatsman(id);

        if(batsman != null) {

            return findBatsman(id);
        }
        else{
            return null;
        }
    }

    //@Override
    public Batsman create(Batsman batsman) {
        this.batsmans.add(batsman);
        return batsman;
    }

    public void delete(String id) {
        Batsman batsman1 = findBatsman(id);
        this.batsmans.remove(id);
    }

    public Batsman update(Batsman batsman) {

        Batsman batsman1 = findBatsman(batsman.toString());

        if(batsmans.contains(batsman))
        {
            batsmans.remove(batsman);
            batsmans.add(batsman);
        }
        return batsman1;

    }

    public Set<Batsman> getAll() {
        return this.batsmans;
    }
}
