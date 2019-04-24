package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.util.CricketUtil;

public class CricketFactory {
    public static Cricket getCricket(String team1, String team2)
    {
        return new Cricket.Builder().team1(CricketUtil.gene())
                .team1(team1)
                .team2(team2)
                .build();
    }


}
