package za.ac.cput.Cricket.domain.members;

import org.springframework.stereotype.Repository;


public class Empire {
    private String type, empireId;

    private Empire(){}

    public String getType() {
        return type;
    }



    public String getEmpireId() {
        return empireId;
    }

    private Empire(Builder builder) {

        this.empireId = builder.empireId;
        this.type = builder.type;

    }

    public static class Builder
    {
        private String type,empireId;

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder empireId(String empireId){
            this.empireId = empireId;
            return this;
        }

        public Empire build(){
            return new Empire(this);
        }

        public Object copy(Empire empire) {
            this.empireId = empire.empireId;
            this.type = empire.empireId;
            return this;
        }
    }
    @Override
    public String toString() {
        return "Empire{" +
                "type='" + type + '\'' +
                ", empireId='" + empireId + '\'' +
                '}';
    }

}
