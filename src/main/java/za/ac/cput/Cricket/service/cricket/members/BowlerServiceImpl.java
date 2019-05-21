package za.ac.cput.Cricket.service.cricket.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.repos.interfaces.BowlerRepo;

import java.util.Set;

@Service
public class BowlerServiceImpl {
    @Autowired

    private BowlerRepo repository;

    public Bowler create(Bowler bowler) {
        return repository.create(bowler);
    }


    public Bowler update(Bowler bowler) {
        return repository.update(bowler);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Bowler read(String s) {
        return repository.read(s);
    }

    public Set<Bowler> getAll() {
        return repository.getAll();
    }
}
