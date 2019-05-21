package za.ac.cput.Cricket.repos.interfaces;


import za.ac.cput.Cricket.domain.records.Result;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface ResultRepo extends Repo<Result, String> {
    Set<Result> getAll();
}
