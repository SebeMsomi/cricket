package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.MainEmpire;

import java.util.Set;

public interface MainEmpireRepo extends Repo<MainEmpire, String> {
    Set<MainEmpire> getAll();

}
