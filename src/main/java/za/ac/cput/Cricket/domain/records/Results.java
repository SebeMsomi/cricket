package za.ac.cput.Cricket.domain.records;

import java.util.Objects;

public class Results {
    private String resultsID;
    private String description;

    public Results(){

    }

    private Results(Builder builder){
        this.resultsID = builder.resultsID;
        this.description = builder.description;


    }

    public String getResultsID() {
        return resultsID;
    }

    public void setResultsID(String resultsID) {
        this.resultsID = resultsID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder{
        private String resultsID;
        private String description;

        public Builder resultsID(String resultsID){
            this.resultsID = resultsID;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Results build(){

            return new Results(this);

        }

        public Builder copy(Results results){

            this.resultsID(results.resultsID);
            this.description(results.getDescription());
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(resultsID, builder.resultsID) &&
                    Objects.equals(description, builder.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(resultsID, description);
        }
    }
}
