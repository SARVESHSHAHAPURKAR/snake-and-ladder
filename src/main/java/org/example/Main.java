package org.example;

import models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Snake> snakes = new ArrayList<Snake>();
        List<Ladder> ladders = new ArrayList<Ladder>();
        Queue<Player> players = new ArrayDeque<>();
        Board board = new Board(100);
        Dice dice = new Dice(1,6);

        Snake s1 = new Snake(98,13);
        Snake s2= new Snake(85,69);
        Snake s3= new Snake(48,26);
        Snake s4 = new Snake(46,23);
        snakes.add(s1); snakes.add(s2);snakes.add(s3);snakes.add(s4);

        Ladder l1 = new Ladder(8,14);
        Ladder l2 = new Ladder(15,42);
        Ladder l3 = new Ladder(24,56);
        Ladder l4 = new Ladder(32,66);
        ladders.add(l1);ladders.add(l2);ladders.add(l3);ladders.add(l4);

        Player p1 = new Player("p1",1);
        Player p2 = new Player("p2",1);
        Player p3 = new Player("p3",1);
        Player p4 = new Player("p4",1);
        players.offer(p1);
        players.offer(p2);players.offer(p3);players.offer(p4);

        Game game = new Game(players,snakes,ladders,board,dice);
        System.out.println("Game started");
        game.playGame();






        //System.out.println("Hello world!");
    }
}