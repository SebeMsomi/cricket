package za.ac.cput.Cricket.factory.records;

import za.ac.cput.Cricket.domain.records.Results;

public class ResultFactory {
    public static Results getResults(String resultsID, String description) {
        return new Results.Builder()
                .resultsID(resultsID)
                .description(description)
                .build();
    }
}
