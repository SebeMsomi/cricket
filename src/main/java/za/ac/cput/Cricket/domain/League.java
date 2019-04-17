package za.ac.cput.Cricket.domain;

public class League {
    private String name;
    private int numOfteam;

    public League(String name, int numOfteam) {
        this.name = name;
        this.numOfteam = numOfteam;
    }

    public String getName() {
        return name;
    }

    public int getNumOfteam() {
        return numOfteam;
    }

    @Override
    public String toString() {
        return "League{" +
                "name='" + name + '\'' +
                ", numOfteam=" + numOfteam +
                '}';
    }
}
