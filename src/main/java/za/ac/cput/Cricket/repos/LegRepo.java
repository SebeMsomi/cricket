package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Leg;

import java.util.Set;

public interface LegRepo extends Repo<Leg, String> {
    Set<Leg> getAll();
}
