package za.ac.cput.Cricket.repos.members;

import za.ac.cput.Cricket.domain.members.Team;
import za.ac.cput.Cricket.repos.interfaces.TeamRepo;

import java.util.HashSet;
import java.util.Set;

public class TeamRepoImpl implements TeamRepo {
    private static TeamRepo repository = null;
    private Set<Team> teams;

    private TeamRepoImpl(){
        this.teams = new HashSet<>();
    }

    public static TeamRepo getRepository(){
        if (repository == null) repository = new TeamRepoImpl();
        return repository;
    }

    public Team create(Team team) {
        //insert into the set of departments
        return team;
    }

    public Team read(String teamId){
        // find the department with the id and return it
        return null;
    }
    public Team update(Team team){
        // find the department that matches this and update it
        return null;
    }

    public void delete(String teamId) {
        // find the department with id and delete it
    }

    public Set<Team> getAll(){



        return this.teams;
    }
}
