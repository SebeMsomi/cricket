package za.ac.cput.Cricket.factory.recess;

import za.ac.cput.Cricket.domain.recess.Lunch;

public class LunchFactory {
    public static Lunch getLunch( String time)
    {
        return new Lunch.Builder()
                .time(time)
                .build();
    }
}
