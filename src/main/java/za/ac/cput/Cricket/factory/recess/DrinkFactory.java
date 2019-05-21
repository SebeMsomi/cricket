package za.ac.cput.Cricket.factory.recess;

import za.ac.cput.Cricket.domain.recess.Drink;

public class DrinkFactory {
    public static Drink getDrink( String time, String drinkId)
    {
        return new Drink.Builder()
                .drinkId(drinkId)
                .time(time)
                .build();
    }
}
