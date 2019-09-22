package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Cricket;


public class CricketFactory {
    public static Cricket getCricket(String team1, String team2)
    {
        return new Cricket.Builder()
                .team1(team1)
                .team2(team2)
                .build();
    }


}
