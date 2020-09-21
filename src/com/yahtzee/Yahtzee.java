package com.yahtzee;
import java.util.ArrayList;

public class Yahtzee {

    public Yahtzee() {
    }

    public void play() {
        ScanInput scanInput = new ScanInput();
        boolean playerYahtzee = false;

        // create player's dice and roll
        PlayerDice playerDice = new PlayerDice();
        playerDice.rollAll();

        // Get player's name: ScanInput.getPlayerName();
        String playerName = scanInput.getPlayerName();

        // Welcome Player ("Player"'s dice:) ScanInput.playerBanner();
        System.out.println("Welcome, " + playerName + ", to the wonderful world of Yahtzee!");
        scanInput.pressEnter();
        // Show initial rolls [ x, x, x, x, x] \t \t \t Turn Number (1)
        for (int turnNumber = 1; turnNumber <= 13; turnNumber++) {
            // show rolls PlayerDice Die ArrayList
            System.out.println("Here are your dice: ");
            playerDice.showDice();

            ArrayList<Integer> diceToReroll;
            // ask player which dice they would like to reroll
            diceToReroll = scanInput.getDiceToReroll();

            // reroll those dice
            playerDice.rerollDice(diceToReroll);

            // if all 5 dice are same, Yahtzee!
            boolean yahtzee = playerDice.checkYahtzee();
            if (yahtzee) {
                playerDice.showDice();
                playerYahtzee = true;
                break;
            };
        }
        if (!playerYahtzee)
            System.out.println("No Yahtzees... Try again!");
    }

}
