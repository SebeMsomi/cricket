package za.ac.cput.Cricket.repos.interfaces;


import za.ac.cput.Cricket.domain.ThirdEmpire;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface ThirdEmpireRepo  extends Repo<ThirdEmpire, String> {
    Set<ThirdEmpire> getAll();
}
