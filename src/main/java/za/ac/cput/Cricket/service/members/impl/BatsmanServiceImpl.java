package za.ac.cput.Cricket.service.members.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.repos.members.BatsmanInterface;
import za.ac.cput.Cricket.service.members.BatsmanService;

import java.util.Set;

//@Service("BatsmanServiceImp")
//public class BatsmanServiceImpl implements BatsmanService {
//    @Autowired
//    private BatsmanServiceImpl service =  null;
//    private BatsmanInterface repository;
//
//    public BatsmanServiceImpl getService()
//    {
//        if(service == null){
//            return new BatsmanServiceImpl();
//        }
//        return service;
//    }
//
//
//    public Batsman create(Batsman batsman) {
//        return repository.create(batsman);
//    }
//
//
//    public Batsman update(Batsman batsman) {
//        return repository.update(batsman);
//    }
//    public void delete(String s) {
//        repository.delete(s);
//
//    }
//    public Batsman read(String s) {
//        return repository.read(s);
//    }
//
//    public Set<Batsman> getAll() {
//        return this.repository.getAll();
//    }
//}
//