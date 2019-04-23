package za.ac.cput.Cricket.domain;

public class Cricket {
    private String team1;
    private String team2;
    // private int results;

    private Cricket(){}

    private Cricket(Builder builder) {


        this.team1 = builder.team1;
        this.team2 = builder.team2;

    }

    public String getTeam1()
    {
        return team1;
    }
    public String getTeam2()
    {
        return team2;
    }

    public static class Builder
    {
        private String team1, team2;
        public Builder team1(String team1){
            this.team1 = team1;
            return this;
        }

        public Builder team2(String team2){
            this.team2 = team2;
            return this;
        }

        public Cricket build(){
            return new Cricket(this);
        }
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                '}';
    }
}
