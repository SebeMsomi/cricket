package za.ac.cput.Cricket.service.records;

import za.ac.cput.Cricket.domain.records.Results;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface ResultService extends Servic<Results, String> {

    Set<Results> getAll();
}
