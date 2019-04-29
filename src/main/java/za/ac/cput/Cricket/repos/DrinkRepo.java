package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Drink;

import java.util.Set;

public interface DrinkRepo extends Repo<Drink, String> {
    Set<Drink> getAll();
}
