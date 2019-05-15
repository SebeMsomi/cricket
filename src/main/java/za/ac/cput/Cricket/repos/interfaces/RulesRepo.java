package za.ac.cput.Cricket.repos.interfaces;


import za.ac.cput.Cricket.domain.Rules;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface RulesRepo extends Repo<Rules, String> {
    Set<Rules> getAll();
}
