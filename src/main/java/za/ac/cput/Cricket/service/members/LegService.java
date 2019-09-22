package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.members.Leg;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface LegService extends Servic<Leg,String> {
    Set<Leg> getAll();
}
