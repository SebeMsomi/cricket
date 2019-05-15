package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.Facilities;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface FacilityRepo extends Repo<Facilities, String> {
    Set<Facilities> getAll();
}
