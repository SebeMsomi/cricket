package za.ac.cput.Cricket.factory.members;


import za.ac.cput.Cricket.domain.members.Bowler;

public class BowlerFactory {
    public static Bowler getBowler(String type)
    {
        return new Bowler.Builder()
                .type(type)
                .build();
    }
}
