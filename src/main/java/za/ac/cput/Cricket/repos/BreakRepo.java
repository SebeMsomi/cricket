package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Break;

import java.util.Set;

public interface BreakRepo  extends Repo<Break, String> {
    Set<Break> getAll();
}
