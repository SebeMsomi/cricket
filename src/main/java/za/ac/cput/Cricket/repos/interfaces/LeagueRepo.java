package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.records.League;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface LeagueRepo extends Repo<League, String> {
    Set<League> getAll();
}
