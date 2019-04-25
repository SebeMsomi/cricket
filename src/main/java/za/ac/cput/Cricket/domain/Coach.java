package za.ac.cput.Cricket.domain;

public class Coach {
    private String experience;
    private int age;
    private String name;

    private Coach(){}

    private Coach(Builder builder)
    {
        this.age = builder.age;
        this.experience = builder.experience;
        this.name = builder.name;
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

    public static class Builder
    {
        private String name, experience;
        private int age;

        public Builder name(String name)
        {
            this.name = name;
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
                '}';
    }
}
