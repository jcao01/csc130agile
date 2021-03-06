package com.company;

import java.io.IOException;

public class Controller {

    Player firstPlayer = new Player("Ron");
    Player secondPlayer = new Player("Alex");
    Player thirdPlayer = new Player("Taylor");
    Player fourthPlayer = new Player("Steven");

    private Game gm;

    public void startGame() {

        gm = new Game(firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);
    }

    public void play() throws IOException {
        gm.playGame();
    }

    public void nextPlayer() {
        gm.incrementCounter();
    }

    public String getMessage() {
        return gm.getPlayerMessage();
    }

    public int getTurn() {
        return gm.getPlayerCounter();
    }

    public String getScore() {
        return gm.getPlayerSpot();
    }


//    public int gameMenu(){
//        String gameInfo = "***Welcome to Snakes and Ladders!***" +
//                "\n\n This virtual version of Snakes and Ladders will be " +
//                "\n using 2 dice via A RandomNumberGenerator." +
//                "\n when the dice is rolled, your number will be automatically added and " +
//                "\n the game will either tell you where you've landed. " +
//                "\n for example: Player One has landed on A ladder: spot moved: 45" +
//                "\n Player one has landed on A snake: spot moved: 21." +
//                "\n Player one: spot moved: 37" +
//                "\n\n please select the number of players:" +
//                "\n1 = One player\n2 = Two players\n3 = Three players\n4 = Four players\n0 = Exit Game\n\n";
//
//        int minOption = 1;
//        int maxOption = 4;
//
//        return promptForInt(gameInfo, minOption, maxOption);
//
//    }
//
//    private int promptForInt(String prompt, int min, int max) {
//        if (min > max) {
//            throw new IllegalArgumentException("The min cannot be greater than the max. min: " + min + ", max: " + max);
//        }
//        int userNum = -1;
//        String input = null;
//        boolean isInvalid = true;
//        do {
//            System.out.print(prompt);
//            try {
//                input = reader.readLine();
//                userNum = Integer.parseInt(input);
//                isInvalid = userNum < min || userNum > max;
//            } catch (IOException ioe) {
//                System.out.println("Whoa! Something technical went wrong. Let's try that again.");
//            } catch (NumberFormatException nfe) {
//                System.out.println("Please enter a numeric value.");
//            }
//            if (isInvalid) {
//                System.out.println("You entered an invalid value. Please, try again.");
//            }
//        } while (isInvalid);
//        return userNum;
//    }



}