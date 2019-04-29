package za.ac.cput.Cricket.repos;


import za.ac.cput.Cricket.domain.ThirdEmpire;

import java.util.Set;

public interface ThirdEmpireRepo  extends Repo<ThirdEmpire, String> {
    Set<ThirdEmpire> getAll();
}
