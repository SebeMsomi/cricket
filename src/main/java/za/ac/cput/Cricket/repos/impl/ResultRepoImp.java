package za.ac.cput.Cricket.repos.impl;

import za.ac.cput.Cricket.domain.Result;

import java.util.HashSet;
import java.util.Set;

public class ResultRepoImp {
    private static ResultRepoImp repository = null;
    private Set<Result> resultSet;

    private ResultRepoImp(){
        this.resultSet = new HashSet<>();
    }

    public static ResultRepoImp getRepository(){
        if (repository == null) repository = new ResultRepoImp();
        return repository;
    }


    public Result create(Result result){
        this.resultSet.add(result);
        return result;
    }

    public Result read(String resultId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String resultId) {
        // find the course, delete it if it exist
    }

    public Result update(Result result){
        // find the course, update it and delete it if it exists
        return result;
    }


    public Set<Result> getAll(){
        return this.resultSet;
    }
}
