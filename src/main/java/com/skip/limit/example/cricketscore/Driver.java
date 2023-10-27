package com.skip.limit.example.cricketscore;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        Player p1 = new Player("abc", 60, "batsman");
        Player p2 = new Player("xyz", 75, "batsman");
        Player p3 = new Player("mno", 20, "bowler");


        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);

        Team csk = new Team();
        csk.setPlayers(players);


        int totalScore = csk.getScore();
        System.out.println("Total Score :" + totalScore);
    }
}
