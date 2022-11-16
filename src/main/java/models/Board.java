package models;

import lombok.Getter;

@Getter
public class Board {

    private int size;
    private int end;

    public Board(int size){
        this.end = size;
    }

}
