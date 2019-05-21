package za.ac.cput.Cricket.domain.members;

import za.ac.cput.Cricket.domain.records.Cricket;

import java.util.Set;

public class Player {

    private String name;
    private int age;

    private Set<Team> team;

    private Player(){}

    private Player(Builder builder)
    {

        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName(){
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public static class Builder{
        private String name;
        private int age;
        private Set<Cricket> crickets;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

    }
}
