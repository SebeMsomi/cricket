package za.ac.cput.Cricket.repos.members;

import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface BowlerRepo extends Repo<Bowler, String> {
    Set<Bowler> getAll();
}
