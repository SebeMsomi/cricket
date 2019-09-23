package za.ac.cput.Cricket.repos.records;

import za.ac.cput.Cricket.domain.records.Result;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface ResultRepository extends Repo<Results, String> {


        Set<Results> getAll();

        }
