package za.ac.cput.Cricket.repos.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.repos.Repo;

import java.util.Set;
@Repository
public interface BatsmanInterface extends JpaRepository<Batsman, String> {
//    Set<Batsman> getAll();
}
