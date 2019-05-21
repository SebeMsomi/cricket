package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.recess.Drink;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface DrinkRepo extends Repo<Drink, String> {
    Set<Drink> getAll();
}
