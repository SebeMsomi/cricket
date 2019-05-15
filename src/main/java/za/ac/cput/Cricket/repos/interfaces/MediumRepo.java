package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.Medium;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface MediumRepo extends Repo<Medium, String> {
    Set<Medium> getAll();
}
