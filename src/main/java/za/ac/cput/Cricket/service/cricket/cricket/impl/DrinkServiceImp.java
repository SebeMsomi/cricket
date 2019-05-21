package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.Drink;
import za.ac.cput.Cricket.repos.impl.DrinkRepoImp;
import za.ac.cput.Cricket.repos.interfaces.DrinkRepo;
import za.ac.cput.Cricket.service.cricket.serviceInterface.DrinkService;

import java.util.Set;

@Service
public class DrinkServiceImp implements DrinkService{
    private DrinkServiceImp service = null;
    private DrinkRepo repository;

    private DrinkServiceImp(){
        this.repository =  DrinkRepoImp.getRepository();
    }
    public DrinkService getService(){
        if (service == null) service = new DrinkServiceImp();
        return service;
    }


    public Drink create(Drink drink) {
        return repository.create(drink);
    }


    public Drink update(Drink drink) {
        return repository.update(drink);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Drink read(String s) {
        return repository.read(s);
    }
    public Set<Drink> getAll()
    {
        return repository.getAll();
    }
}
