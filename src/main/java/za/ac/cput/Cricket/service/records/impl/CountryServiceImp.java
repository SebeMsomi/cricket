package za.ac.cput.Cricket.service.records.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.records.Country;
import za.ac.cput.Cricket.repos.records.impl.CountryRepoImp;
import za.ac.cput.Cricket.repos.interfaces.CountryRepo;
import za.ac.cput.Cricket.service.members.CountryService;

import java.util.Set;

@Service("countryServiceImp")
public class CountryServiceImp implements CountryService {

    private CountryServiceImp service = null;
    private CountryRepo repository;

    public CountryServiceImp(){
        this.repository = CountryRepoImp.getRepository();
    }
    public CountryServiceImp getService(){
        if (service == null){
            service = new CountryServiceImp();
        }
        return service;
    }

    public Country create(Country country) {
        return repository.create(country);
    }

    public Set<Country> getAll() {
        return repository.getAll();
    }

    public Country read(String s) {
        return repository.read(s);
    }

    public Country update(Country country) {
        return repository.update(country);
    }

    public void delete(String s) {
        repository.delete(s);
    }
}
