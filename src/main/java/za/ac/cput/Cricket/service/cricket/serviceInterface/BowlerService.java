package za.ac.cput.Cricket.service.cricket.serviceInterface;

import za.ac.cput.Cricket.domain.Bowler;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface BowlerService extends Servic<Bowler,String> {
    Set<Bowler> getAll();
}