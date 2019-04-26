package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.domain.Team;

import java.util.Set;

public interface BowlerRepo extends Repo<Bowler, String> {
    Set<Team> getAll();
}
