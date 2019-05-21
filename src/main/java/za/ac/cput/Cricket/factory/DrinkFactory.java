package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Drink;

public class DrinkFactory {
    public static Drink getDrink( String time, String drinkId)
    {
        return new Drink.Builder()
                .drinkId(drinkId)
                .time(time)
                .build();
    }
}
