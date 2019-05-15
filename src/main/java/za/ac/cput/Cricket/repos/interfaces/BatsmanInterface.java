package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface BatsmanInterface extends Repo<Batsman, String> {
    Set<Batsman> getAll();
}
