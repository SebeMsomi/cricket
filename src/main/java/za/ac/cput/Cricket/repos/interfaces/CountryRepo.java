package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.Country;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface CountryRepo  extends Repo<Country, String> {
    Set<Country> getAll();
}
