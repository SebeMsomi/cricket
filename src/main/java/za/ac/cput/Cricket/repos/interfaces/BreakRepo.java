package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.recess.Break;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface BreakRepo  extends Repo<Break, String> {
    Set<Break> getAll();
}
