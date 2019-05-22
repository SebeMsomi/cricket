package za.ac.cput.Cricket.domain.members;

import za.ac.cput.Cricket.domain.records.Cricket;

import java.util.Objects;
import java.util.Set;

public class Player {

    private String name;
    private int age;
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

        public Player build() {
            return new Player(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age &&
                name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
