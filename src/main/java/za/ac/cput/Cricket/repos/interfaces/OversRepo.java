package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.Overs;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface OversRepo extends Repo<Overs, String> {
    Set<Overs> getAll();
}
