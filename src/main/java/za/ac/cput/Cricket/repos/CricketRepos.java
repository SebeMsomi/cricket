package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Cricket;

public interface CricketRepos {
    Cricket create(Cricket cricket);
    Cricket update(Cricket cricket);
    void delete(Cricket cricket);
    Cricket read(String cricketId);
}
