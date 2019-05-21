package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface LegRepo extends Repo<Leg, String> {
    Set<Leg> getAll();
}
