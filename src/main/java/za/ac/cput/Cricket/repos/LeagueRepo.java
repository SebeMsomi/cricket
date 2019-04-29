package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.League;

import java.util.Set;

public interface LeagueRepo extends Repo<League, String> {
    Set<League> getAll();
}
