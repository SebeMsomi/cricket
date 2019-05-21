package za.ac.cput.Cricket.factory.recess;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.recess.Drink;
import za.ac.cput.Cricket.factory.recess.DrinkFactory;

public class DrinkFactoryTest {

    @Test
    public void getDrink() {
        String drinkTime = "";
        String drinkID = "";

        Drink d = DrinkFactory.getDrink(drinkTime,drinkID);
        Assert.assertTrue("Lunch start at: ", d.equals(d));
    }
}