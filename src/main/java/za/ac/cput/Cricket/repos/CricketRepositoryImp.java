package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Cricket;

import java.util.HashSet;
import java.util.Set;

public class CricketRepositoryImp implements CricketRepos {

    private static CricketRepos repository = null;
    private Set<Cricket> crickets;

    private CricketRepositoryImp() {
        this.crickets = new HashSet<>();
    }

    private Cricket findCricket(String cricketId) {
        return this.crickets.stream().filter(cricket -> cricket.getTeam1().equals(cricketId)).findAny().orElse(null);

    }

    public static CricketRepos getRepository(){
        if (repository == null) repository = new CricketRepositoryImp();
        return repository;
    }

    @Override
    public Cricket create(Cricket cricket) {
        this.crickets.add(cricket);
        return cricket;
    }

    @Override
    public void delete(Cricket cricket) {
        this.crickets.remove(cricket);
    }

    @Override
    public Cricket read(final String cricketId) {
        return findCricket(cricketId);
    }

    @Override
    public Cricket update(Cricket cricket) {
        // find the student to update in the student collection
        // if found, update and save back into the student collection
        return null;
    }

    public Set<Cricket> getAll() {
        return this.crickets;
    }
}

