package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Lunch;

public class LunchFactory {
    public static Lunch getLunch( String time)
    {
        return new Lunch.Builder()
                .time(time)
                .build();
    }
}
