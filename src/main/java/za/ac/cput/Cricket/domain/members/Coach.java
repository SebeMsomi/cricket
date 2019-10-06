package za.ac.cput.Cricket.domain.members;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coach {
    @Id
    private String experience;
    private int age;
    private String name, coachId;

    private Coach(){}

    private Coach(Builder builder)
    {
        this.age = builder.age;
        this.experience = builder.experience;
        this.name = builder.name;
        this.coachId = builder.coachId;
    }

    public String getName()
    {
        return name;
    }
    public String getExperience()
    {
        return experience;
    }
    public int getAge()
    {
        return age;
    }

    public String getCoachId() {
        return coachId;
    }

    public static class Builder
    {
        private String name, experience, coachId;
        private int age;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder coachId(String coachId)
        {
            this.coachId = coachId;
            return this;
        }

        public Builder experience(String experience)
        {
            this.experience = experience;
            return this;
        }
        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

        public Coach build()
        {
            return new Coach(this);
        }
    }

    @Override
    public String toString() {
        return "Coach{" +
                "experience='" + experience + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", coachId='" + coachId + '\'' +
                '}';
    }
}
