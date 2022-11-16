package models;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Queue;

@AllArgsConstructor
public class Game {

    Queue<Player> players;
    List<Snake> snakes;
    List <Ladder> ladders;
    Board board;
    Dice dice;


    public void playGame(){

        while(players.size()>1) {
            Player player = players.poll();
            int currentPos = player.getPosition();
            dice.generateCurrentVal();
            //System.out.println("DIce value is "+dice.getCurrentVal());
            int moves = dice.getCurrentVal();

            int newPos = currentPos + moves;
            if(newPos>board.getEnd()){
                newPos= currentPos;
            }

            if(newPos==board.getEnd()){
                System.out.println("Player "+player.getName()+" won");
                continue;
            }

            for(Snake snake:snakes){
                if(snake.getStart()==newPos){
                    newPos = snake.getEnd();
                    System.out.println("Bit by snake");
                    break;
                }
            }

            for(Ladder ladder: ladders){
                if(ladder.getStart() == newPos){
                    newPos = ladder.getEnd();
                    System.out.println("Climbed ladder");
                    break;
                }
            }

            player.setPosition(newPos);

            players.offer(player);
        }


    }



}
