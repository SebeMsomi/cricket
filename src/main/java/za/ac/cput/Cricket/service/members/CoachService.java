package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.members.Coach;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface CoachService extends Servic<Coach,String> {
        Set<Coach> getAll();
}
