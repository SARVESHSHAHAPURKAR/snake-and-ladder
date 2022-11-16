package models;

import lombok.Getter;

@Getter
public class Dice {

    public Dice(int minVal, int maxVal){
        this.minVal=minVal;
        this.maxVal = maxVal;
    }
    private int minVal;
    private int maxVal;
    private int currentVal;

    public void generateCurrentVal(){
        this.currentVal= (int)(Math.random()*(maxVal-minVal+1)+minVal);
    }


}
