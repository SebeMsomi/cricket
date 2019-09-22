package za.ac.cput.Cricket.repos.members;



import za.ac.cput.Cricket.domain.members.Player;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface PlayerRepo extends Repo<Player, String> {
    Set<Player> getAll();

}
