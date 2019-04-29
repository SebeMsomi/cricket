package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Coach;

import java.util.Set;

public interface CoachRepo extends Repo<Coach, String> {
    Set<Coach> getAll();
}
