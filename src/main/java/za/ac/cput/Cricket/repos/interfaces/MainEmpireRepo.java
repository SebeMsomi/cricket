package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.members.MainEmpire;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface MainEmpireRepo extends Repo<MainEmpire, String> {
    Set<MainEmpire> getAll();

}
