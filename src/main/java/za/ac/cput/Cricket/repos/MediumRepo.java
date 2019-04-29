package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Medium;

import java.util.Set;

public interface MediumRepo extends Repo<Medium, String> {
    Set<Medium> getAll();
}
