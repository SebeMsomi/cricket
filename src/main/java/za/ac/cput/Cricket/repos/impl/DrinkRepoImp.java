package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Drink;

import java.util.HashSet;
import java.util.Set;

public class DrinkRepoImp {
    private static DrinkRepoImp repository = null;
    private Set<Drink> drinkSet;

    private DrinkRepoImp(){
        this.drinkSet = new HashSet<>();
    }

    public static DrinkRepoImp getRepository(){
        if (repository == null) repository = new DrinkRepoImp();
        return repository;
    }


    public Drink create(Drink drink){
        this.drinkSet.add(drink);
        return drink;
    }

    public Drink read(String drinkId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String coachID) {
        // find the course, delete it if it exist
    }

    public Drink update(Drink drink){
        // find the course, update it and delete it if it exists
        return drink;
    }


    public Set<Drink> getAll(){
        return this.drinkSet;
    }
}
