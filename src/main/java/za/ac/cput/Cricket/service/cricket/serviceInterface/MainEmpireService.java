package za.ac.cput.Cricket.service.cricket.serviceInterface;

import za.ac.cput.Cricket.domain.members.MainEmpire;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface MainEmpireService  extends Servic<MainEmpire, String> {

    // Set<Cricket> getAllAppDevCourses();
    Set<MainEmpire> getAll();
}
