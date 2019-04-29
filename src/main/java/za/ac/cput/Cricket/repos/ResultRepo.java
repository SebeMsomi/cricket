package za.ac.cput.Cricket.repos;


import za.ac.cput.Cricket.domain.Result;

import java.util.Set;

public interface ResultRepo extends Repo<Result, String> {
    Set<Result> getAll();
}
