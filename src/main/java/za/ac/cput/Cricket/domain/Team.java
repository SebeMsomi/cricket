package za.ac.cput.Cricket.domain;

import java.nio.file.attribute.AclEntry;

public class Team {
    private String name;
    private String sponser;

    public String getName() {
        return name;
    }

    public String getSponser() {
        return sponser;
    }
    private Team(){}

    private Team(Builder builder) {


        this.name = builder.name;
        this.sponser = builder.sponser;

    }
    public String getTeam1()
    {
        return name;
    }
    public String getTeam2()
    {
        return sponser;
    }

    public static class Builder
    {
        private String name, sponser;
        public Builder team1(String name){
            this.name = name;
            return this;
        }

        public Builder team2(String sponser){
            this.sponser = sponser;
            return this;
        }

        public Team build(){
            return new Team(this);
        }
    }

}
