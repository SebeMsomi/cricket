package za.ac.cput.Cricket.service.members.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.recess.Break;
import za.ac.cput.Cricket.repos.interfaces.BreakRepo;
import za.ac.cput.Cricket.service.members.BreakService;

import java.util.Set;

@Service("Break")
public class BreakServiceImpl implements BreakService {
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
