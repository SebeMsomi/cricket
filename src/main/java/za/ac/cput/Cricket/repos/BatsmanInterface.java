package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Batsman;

import java.util.Set;

public interface BatsmanInterface extends Repo<Batsman, String>{
    Set<Batsman> getAll();
}
