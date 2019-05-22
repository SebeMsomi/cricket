package za.ac.cput.Cricket.service.serviceInterface;

import za.ac.cput.Cricket.domain.infrastructure.Facilities;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface FacilityService extends Servic<Facilities, String> {

    // Set<Cricket> getAllAppDevCourses();
    Set<Facilities> getAll();
}
