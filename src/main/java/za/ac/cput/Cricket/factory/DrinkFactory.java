package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Drink;

public class DrinkFactory {
    public static Drink getDrink( int time)
    {
        return new Drink.Builder()
                .time(12)
                .build();
    }
}
