package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.Fast;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface FastRepo extends Repo<Fast, String> {
    Set<Fast> getAll();
}
