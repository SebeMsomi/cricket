package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Empire;

import java.util.Set;

public interface EmpireRepo extends Repo<Empire, String> {
    Set<Empire> getAll();
}
