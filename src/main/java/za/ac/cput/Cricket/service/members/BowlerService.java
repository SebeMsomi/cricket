package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface BowlerService extends Servic<Bowler,String> {
    Set<Bowler> getAll();
}
