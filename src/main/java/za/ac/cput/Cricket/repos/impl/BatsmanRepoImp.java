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

    private Batsman findCricket(String id) {
        return this.batsmans.stream().filter(batsman -> batsman.equals(id)).findAny().orElse(null);

    }

    public Batsman read(final String id) {
        Batsman batsman = findCricket(id);

        if(batsman != null) {

            return findCricket(id);
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


    public void delete(Batsman batsman) {
        this.batsmans.remove(batsman);
    }



    public Batsman update(Batsman batsman) {
        // find the student to update in the student collection
        // if found, update and save back into the student collection
        return null;
    }




    public Set<Batsman> getAll() {
        return this.batsmans;
    }
}
