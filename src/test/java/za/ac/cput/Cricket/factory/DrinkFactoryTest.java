package za.ac.cput.Cricket.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Cricket.domain.Drink;

import static org.junit.Assert.*;

public class DrinkFactoryTest {

    @Test
    public void getDrink() {
        String drinkTime = "";
        String drinkID = "";

        Drink d = DrinkFactory.getDrink(drinkTime,drinkID);
        Assert.assertTrue("Lunch start at: ", d.equals(d));
    }
}