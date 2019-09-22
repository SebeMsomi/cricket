package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface CountryService extends Servic<Country,String> {
    Set<Country> getAll();
}
