package za.ac.cput.Cricket.factory.members;

import za.ac.cput.Cricket.domain.members.Player;

public class Playerfactory {
    public static Player getPlayer(String name, int age)
    {
        return new Player.Builder()
                .name(name)
                .age(age)
                .build();

    }
}
