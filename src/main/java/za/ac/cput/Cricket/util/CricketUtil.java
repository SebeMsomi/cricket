package za.ac.cput.Cricket.util;

import java.util.UUID;

public class CricketUtil {
    public static String gene(){
        return UUID.randomUUID().toString();
    }
}