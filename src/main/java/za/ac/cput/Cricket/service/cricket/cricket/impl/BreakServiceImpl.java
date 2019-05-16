package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.Break;
import za.ac.cput.Cricket.repos.interfaces.BreakRepo;

import java.util.Set;

@Service("Break")
public class BreakServiceImpl {
    @Autowired

    private BreakRepo repository;
    public Break create(Break breaks) {
        return repository.create(breaks);
    }


    public Break update(Break breaks) {
        return repository.update(breaks);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Break read(String s) {
        return repository.read(s);
    }
    public Set<Break> getAll()
    {
        return repository.getAll();
    }
}
