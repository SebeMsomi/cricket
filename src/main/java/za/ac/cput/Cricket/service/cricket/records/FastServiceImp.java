package za.ac.cput.Cricket.service.cricket.records;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Cricket.domain.records.Fast;
import za.ac.cput.Cricket.repos.interfaces.FastRepo;

import java.util.Set;

public class FastServiceImp {
    @Autowired
    private FastRepo repository;


    public Fast create(Fast fast) {
        return repository.create(fast);
    }


    public Fast update(Fast fast) {
        return repository.update(fast);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Fast read(String s) {
        return repository.read(s);
    }

    public Set<Fast> getAll() {
        return repository.getAll();
    }

}
