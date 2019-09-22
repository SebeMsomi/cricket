package za.ac.cput.Cricket.repos.members.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Cricket.domain.members.Player;
import za.ac.cput.Cricket.repos.members.PlayerRepo;

import java.util.*;


public class PlayerRepoImp implements PlayerRepo {
    private static PlayerRepoImp repository = null;
    private Map<String, Player> players;

    private PlayerRepoImp(){
        this.players = new HashMap<>();
    }

    public static PlayerRepo getRepository(){
        if (repository == null) repository = new PlayerRepoImp();
        return repository;
    }

    public Set<Player> getAll(){
        Collection<Player> empires1 = this.players.values();
        Set<Player> set = new HashSet<>();
        set.addAll(empires1);
        return set;
    }

    @Override
    public Player create(Player player) {
        this.players.put(player.getName(), player);
        return player;
    }

    @Override
    public Player update(Player player) {
        this.players.replace(player.getName(),player);
        return this.players.get(player.getName());
    }

    @Override
    public void delete(String s) {
        this.players.remove(s);
    }

    @Override
    public Player read(String s) {
        return this.players.get(s);
    }
}
