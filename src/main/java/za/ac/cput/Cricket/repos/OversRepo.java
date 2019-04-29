package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Overs;

import java.util.Set;

public interface OversRepo extends Repo<Overs, String> {
    Set<Overs> getAll();
}
