package za.ac.cput.Cricket.service.cricket.serviceInterface;

import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface CricketSer extends Servic<Cricket, String> {

   // Set<Cricket> getAllAppDevCourses();
    Set<Cricket> getAll();
}