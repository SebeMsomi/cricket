package za.ac.cput.Cricket.service.records.impl;

import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.repos.records.ResultRepository;
import za.ac.cput.Cricket.repos.records.impl.ResultRepoImp;
import za.ac.cput.Cricket.service.Servic;
import za.ac.cput.Cricket.service.records.ResultService;

import java.util.Set;

public class ResultServiceImp implements ResultService {

    private ResultServiceImp service = null;
    private ResultRepository repository;

    public ResultServiceImp() {
        repository = ResultRepoImp.getReportRepository();
    }

    public ResultServiceImp getService(){

        if(service == null){
            return new ResultServiceImp();
        }
        return service;
    }

    @Override
    public Set<Results> getAll() {
        return repository.getAll();
    }

    @Override
    public Results create(Results results) {
        return repository.create(results);
    }

    @Override
    public Results read(String id) {
        return null;
    }

    @Override
    public Results update(Results results) {
        return repository.update(results);
    }

    @Override
    public void delete(String id) {

        repository.delete(id);
    }

}
