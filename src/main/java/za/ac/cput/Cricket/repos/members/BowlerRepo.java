package za.ac.cput.Cricket.repos.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;

@Repository
public interface BowlerRepo extends JpaRepository<Bowler, String> {
//    Set<Bowler> getAll();
}
