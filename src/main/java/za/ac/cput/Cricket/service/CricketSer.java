package za.ac.cput.Cricket.service;

import za.ac.cput.Cricket.domain.Cricket;

import java.util.Set;

public interface CricketSer extends Servic<Cricket, String> {

    Set<Cricket> getAllAppDevCourses();
    Set<Cricket> getAll();
}
