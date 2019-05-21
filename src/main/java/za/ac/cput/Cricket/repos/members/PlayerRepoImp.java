package za.ac.cput.Cricket.repos.members;

import za.ac.cput.Cricket.domain.members.Player;

import java.util.HashSet;
import java.util.Set;

public class PlayerRepoImp {
    private static PlayerRepoImp repository = null;
    private Set<Player> players;

    private PlayerRepoImp(){
        this.players = new HashSet<>();
    }

    public static PlayerRepoImp getRepository(){
        if (repository == null) repository = new PlayerRepoImp();
        return repository;
    }


    public Player create(Player player){
        this.players.add(player);
        return player;
    }

    public Player read(String playerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String playerId) {
        // find the course, delete it if it exist
    }

    public Player update(Player drink){
        // find the course, update it and delete it if it exists
        return drink;
    }


    public Set<Player> getAll(){
        return this.players;
    }
}
