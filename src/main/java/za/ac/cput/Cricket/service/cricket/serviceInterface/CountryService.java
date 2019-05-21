package za.ac.cput.Cricket.service.cricket.serviceInterface;

import za.ac.cput.Cricket.domain.Country;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface CountryService extends Servic<Country,String> {
    Set<Country> getAll();
}
