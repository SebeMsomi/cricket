package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.BatsmanInterface;

import java.util.HashSet;
import java.util.Set;

public class BatsmanRepoImp implements BatsmanInterface{
    private static BatsmanInterface repository = null;
    private Set<Batsman> batsmans;

    private BatsmanRepoImp() {
        this.batsmans = new HashSet<>();
    }

    public static BatsmanInterface getRepository(){
        if (repository == null) repository = (BatsmanInterface) new BatsmanRepoImp();
        return repository;
    }

    //@Override
    public Batsman create(Batsman batsman) {

        this.batsmans.add(batsman);
        return batsman;
    }


    public void delete(Batsman batsman) {
        this.batsmans.remove(batsman);
    }

    private Batsman findBatsman(int rating) {
        return this.batsmans.stream().filter(batsman -> batsman.getRatings()

                .trim().equals(rating.trim())
                .findAny().orElse(null);


    }
    public Batsman read(final int batsman) {
        Batsman batsman1 = findBatsman(batsman);

        return  batsman1 == null ? null : batsman1;
    }


    public Batsman update(Batsman batsman) {
        // find the student to update in the student collection
        // if found, update and save back into the student collection
        return null;
    }


    public void delete(String s) {

    }

    @Override
    public Batsman read(int s) {
        Batsman batsman1 = findBatsman(s);
        return batsman1 == null ? null : batsman1;
    }

    public Set<Batsman> getAll() {
        return this.batsmans;
    }
}
