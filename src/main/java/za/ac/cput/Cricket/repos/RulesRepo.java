package za.ac.cput.Cricket.repos;


import za.ac.cput.Cricket.domain.Rules;

import java.util.Set;

public interface RulesRepo extends Repo<Rules, String> {
    Set<Rules> getAll();
}
