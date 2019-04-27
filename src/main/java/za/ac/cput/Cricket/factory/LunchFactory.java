package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Lunch;

public class LunchFactory {
    public static Lunch getLunch( int time)
    {
        return new Lunch.Builder()
                .time(12)
                .build();
    }
}
