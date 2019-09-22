package za.ac.cput.Cricket.service.members.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.members.Bowler;
import za.ac.cput.Cricket.service.members.BowlerService;

import java.util.Set;

@Service
public class BowlerServiceImpl implements BowlerService {
    @Autowired

    private BowlerServiceImpl service;
    public BowlerServiceImpl getService()
    {
        if(service == null){
            return new BowlerServiceImpl();
        }
        return service;
    }

    public Bowler create(Bowler bowler) {
        return service.create(bowler);
    }


    public Bowler update(Bowler bowler) {
        return service.update(bowler);
    }
    public void delete(String s) {
        service.delete(s);

    }
    public Bowler read(String s) {
        return service.read(s);
    }

    public Set<Bowler> getAll() {
        return service.getAll();
    }
}
