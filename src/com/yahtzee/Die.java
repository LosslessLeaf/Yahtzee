package com.yahtzee;
import java.util.Random;

public class Die {

    Random rand = new Random();

    private int value;
    private int maxVal;

    // takes max value
    public Die(int maxVal) {
        this.maxVal = maxVal;
    }

    public void roll() {
        this.value = rand.nextInt(maxVal) + 1;
    }

    public int getVal() {
        return this.value;
    }


}
