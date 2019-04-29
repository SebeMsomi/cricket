package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Country;

import java.util.Set;

public interface CountryRepo  extends Repo<Country, String> {
    Set<Country> getAll();
}
