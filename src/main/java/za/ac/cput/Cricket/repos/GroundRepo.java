package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Ground;

import java.util.Set;

public interface GroundRepo extends Repo<Ground, String> {
    Set<Ground> getAll();
}
