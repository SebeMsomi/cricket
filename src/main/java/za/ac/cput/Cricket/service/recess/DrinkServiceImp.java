package za.ac.cput.Cricket.service.recess;

import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.recess.Drink;
import za.ac.cput.Cricket.repos.recess.DrinkRepoImp;
import za.ac.cput.Cricket.repos.interfaces.DrinkRepo;
import za.ac.cput.Cricket.service.members.DrinkService;

import java.util.Set;

@Service
public class DrinkServiceImp implements DrinkService{
    private DrinkServiceImp service = null;
    private DrinkRepo repository;


    public DrinkService getService(){
        if (service == null) {
            service = new DrinkServiceImp();
        }
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
