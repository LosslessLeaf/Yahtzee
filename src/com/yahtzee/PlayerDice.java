package com.yahtzee;
import java.util.ArrayList;

public class PlayerDice {
    private ArrayList<Die> dice = new ArrayList<Die>();

    public PlayerDice() {
        for (int i = 0; i < 5; i++) {
            this.dice.add(new Die(6));
        }
    }

    public void rollAll() {
        for (Die die : this.dice) {
            die.roll();
        }
    }

    public void rerollDice(ArrayList<Integer> diceToReroll) {
        for (Integer i : diceToReroll) {
            this.dice.get(i - 1).roll();
        }
    }

    public void showDice() {
        for (Die die : this.dice) {
            System.out.println((this.dice.indexOf(die) + 1) + ") " + die.getVal() + " ");
        }
    }

    public boolean checkYahtzee() {

        boolean yahtzee = true;
        for (Die die : this.dice) {
            if (die.getVal() != this.dice.get(0).getVal()) {
                yahtzee = false;
                return false;
            }
        }

        if (yahtzee) {
            System.out.println("YAHTZEE!!!");
            return true;
        }

        return false;
    }

}
