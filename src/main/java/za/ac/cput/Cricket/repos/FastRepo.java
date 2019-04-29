package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Fast;

import java.util.Set;

public interface FastRepo extends Repo<Fast, String> {
    Set<Fast> getAll();
}
