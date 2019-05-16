package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.Drink;
import za.ac.cput.Cricket.repos.interfaces.DrinkRepo;

import java.util.Set;

@Service
public class DrinkServiceImp {
    @Autowired

    private DrinkRepo repository;
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
