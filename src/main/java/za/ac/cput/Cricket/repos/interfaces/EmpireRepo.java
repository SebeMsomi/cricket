package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.members.Empire;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface EmpireRepo extends Repo<Empire, String> {
    Set<Empire> getAll();
}
