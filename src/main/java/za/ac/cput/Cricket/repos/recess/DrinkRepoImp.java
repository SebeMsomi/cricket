package za.ac.cput.Cricket.repos.recess;

import za.ac.cput.Cricket.domain.recess.Drink;
import za.ac.cput.Cricket.repos.interfaces.DrinkRepo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DrinkRepoImp implements DrinkRepo {
    private static DrinkRepoImp repository = null;
    private Map<String, Drink> drinks;

    private DrinkRepoImp(){
        this.drinks = (Map<String, Drink>) new HashSet<Object>();
    }

    public static DrinkRepo getRepository(){
        if (repository == null) repository = new DrinkRepoImp();
        return repository;
    }

    public Set<Drink> getAll(){
        Collection<Drink> drinks1 = this.drinks.values();
        Set<Drink> set = new HashSet<>();
        set.addAll(drinks1);
        return set;
    }

    @Override
    public Drink create(Drink drink) {
        this.drinks.put(drink.getDrinkId(),drink);
        return drink;
    }

    @Override
    public Drink update(Drink drink) {
        this.drinks.replace(drink.getDrinkId(),drink);
        return this.drinks.get(drink.getDrinkId());
    }

    @Override
    public void delete(String s) {
        this.drinks.remove(s);
    }

    @Override
    public Drink read(String s) {
        return this.drinks.get(s);
    }
}
