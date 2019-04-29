package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Facilities;

import java.util.Set;

public interface FacilityRepo extends Repo<Facilities, String> {
    Set<Facilities> getAll();
}
