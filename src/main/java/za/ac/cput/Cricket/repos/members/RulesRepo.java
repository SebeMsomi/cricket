package za.ac.cput.Cricket.repos.members;


import za.ac.cput.Cricket.domain.records.Rules;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface RulesRepo extends Repo<Rules, String> {
    Set<Rules> getAll();
}
