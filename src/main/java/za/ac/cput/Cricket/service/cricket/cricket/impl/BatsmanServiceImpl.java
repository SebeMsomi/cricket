package za.ac.cput.Cricket.service.cricket.cricket.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.Batsman;
import za.ac.cput.Cricket.repos.interfaces.BatsmanInterface;

import java.util.Set;

@Service
public class BatsmanServiceImpl {
    @Autowired
    private BatsmanInterface repository;


    public Batsman create(Batsman batsman) {
        return repository.create(batsman);
    }


    public Batsman update(Batsman batsman) {
        return repository.update(batsman);
    }
    public void delete(String s) {
        repository.delete(s);

    }
    public Batsman read(String s) {
        return repository.read(s);
    }

    public Set<Batsman> getAll() {
        return repository.getAll();
    }
}
