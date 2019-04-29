package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Player;

import java.util.Set;

public interface PlayerRepo extends Repo<Player, String> {
    Set<Player> getAll();

}
