package za.ac.cput.Cricket.repos.records.impl;

import za.ac.cput.Cricket.domain.records.Result;
import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.repos.records.ResultRepository;

import java.util.HashSet;
import java.util.Set;

public class ResultRepoImp  implements ResultRepository {

    private static ResultRepoImp reportRepository = null;
    private Set<Results> results;

    public ResultRepoImp(){
        results = new HashSet<>();
    }

    public static ResultRepoImp getReportRepository() {

        if(reportRepository == null){
            return new ResultRepoImp();
        }
        return reportRepository;
    }


    @Override
    public Results create(Results result) {


        results.add(result);
        return result;
    }

    @Override
    public Results read(String id) {

        return results.stream().filter(results -> results.getResultsID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Results update(Results results1) {

        Results result = read(results1.getResultsID());
        if(results != null){
            results.remove(result);
            results.add(result);
            return result;
        }
        return null;
    }

    @Override
    public void delete(String id) {

        Results del = read(id);
        results.remove(del);

    }

    @Override
    public Set<Results> getAll() {
        return results;
    }
}
