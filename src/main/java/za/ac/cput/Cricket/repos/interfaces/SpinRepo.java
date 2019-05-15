package za.ac.cput.Cricket.repos.interfaces;



import za.ac.cput.Cricket.domain.Spin;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface SpinRepo  extends Repo<Spin, String> {
    Set<Spin> getAll();
}
