package za.ac.cput.Cricket.repos.interfaces;

import za.ac.cput.Cricket.domain.records.Cricket;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

public interface CricketRepos extends Repo<Cricket, String> {
    /*Cricket create(Cricket cricket);
    Cricket update(Cricket cricket);
    void delete(Cricket cricket);
    Cricket read(String cricketId);*/

    Set<Cricket> getAll();
}
