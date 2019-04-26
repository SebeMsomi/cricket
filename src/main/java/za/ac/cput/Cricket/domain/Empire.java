package za.ac.cput.Cricket.domain;

public class Empire {
    private String type;

    private Empire(){}

    public String getType() {
        return type;
    }

    private Empire(Builder builder) {


        this.type = builder.type;

    }
    public static class Builder
    {
        private String type;

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Empire build(){
            return new Empire(this);
        }
    }
}
