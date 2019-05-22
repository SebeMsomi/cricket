package za.ac.cput.Cricket.service.serviceInterface;

import za.ac.cput.Cricket.domain.infrastructure.Ground;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface GroundService extends Servic<Ground, String> {

        // Set<Cricket> getAllAppDevCourses();
        Set<Ground> getAll();
}
