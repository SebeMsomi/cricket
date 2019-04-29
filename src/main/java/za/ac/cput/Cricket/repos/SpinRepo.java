package za.ac.cput.Cricket.repos;



import za.ac.cput.Cricket.domain.Spin;

import java.util.Set;

public interface SpinRepo  extends Repo<Spin, String> {
    Set<Spin> getAll();
}
