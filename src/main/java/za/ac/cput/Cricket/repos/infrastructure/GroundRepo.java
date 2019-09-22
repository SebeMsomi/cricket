package za.ac.cput.Cricket.repos.infrastructure;



import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface GroundRepo extends Repo<Ground, String> {
    Set<Ground> getAll();
}
