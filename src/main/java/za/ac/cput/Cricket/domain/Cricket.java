package za.ac.cput.Cricket.domain;


import java.util.Objects;

public class Cricket {
    private String team1;
    private String team2;
    private String cricketId;


// private int results;



    private Cricket(){}

    private Cricket(Builder builder) {


        this.team1 = builder.team1;
        this.team2 = builder.team2;
        this.cricketId = builder.cricketId;

    }

    public String getTeam1()
    {
        return team1;
    }
    public String getTeam2()
    {
        return team2;
    }
    public String getCricketId() {
        return cricketId;
    }

    public static class Builder
    {
        private String team1, team2, cricketId ;
        public Builder team1(String team1){
            this.team1 = team1;
            return this;
        }

        public Builder team2(String team2){
            this.team2 = team2;
            return this;
        }

        public Builder cricketId(String cricketId){
            this.cricketId = cricketId;
            return this;
        }

        public Cricket build(){
            return new Cricket(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cricket cricket = (Cricket) o;
        return cricketId.equals(cricket.cricketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cricketId);
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                '}';
    }
}
