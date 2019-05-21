package za.ac.cput.Cricket.service.cricket.serviceInterface;

import za.ac.cput.Cricket.domain.Leg;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface LegService extends Servic<Leg,String> {
    Set<Leg> getAll();
}
