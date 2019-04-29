package za.ac.cput.Cricket.service.serviceImp;

import za.ac.cput.Cricket.domain.Cricket;
import za.ac.cput.Cricket.repos.impl.CricketRepositoryImp;
import za.ac.cput.Cricket.service.CricketSer;

import java.util.Set;

public class CricketServiceImp implements CricketSer {

    private CricketServiceImp service = null;
    private CricketRepositoryImp repository;

    private CricketServiceImp(){
        this.repository = (CricketRepositoryImp) CricketRepositoryImp.getRepository();
    }

    public CricketSer getService(){
        if (service == null) service = new CricketServiceImp();
        return service;
    }


    //@Override
    public Cricket create(Cricket cricket) {
        return this.repository.create(cricket);
    }

    //@Override
    public Cricket update(Cricket cricket) {
        return this.repository.update(cricket);
    }

    //@Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    //@Override
    public Cricket read(String s) {
        return this.repository.read(s);
    }

   // @Override
    public Set<Cricket> getAllAppDevCourses() {
        Set<Cricket> courses = getAll();

        return null;
    }

    //@Override
    public Set<Cricket> getAll() {
        return this.repository.getAll();
    }
}
