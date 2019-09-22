package za.ac.cput.Cricket.repos.members;

import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface CoachRepo extends Repo<Coach, String> {
    Set<Coach> getAll();

}
