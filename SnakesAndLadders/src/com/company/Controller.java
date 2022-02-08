package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Controller {


public int[] boardPlace = new int[50];
public String playerOne;
public String playerTwo;
public String playerThree;
public String playerFour;


private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
Players players = new Players();




    public void run() throws IOException {
         int userChoice = -1;
         do {
             userChoice = gameMenu();

             switch(userChoice) {
                 case 1:
                     players.onePlayer();
                     break;

                 case 2:
                     players.twoPlayer();

                     break;
                 case 3:
                     players.threePlayer();

                     break;
                 case 4:
                     players.fourPlayer();
                     break;

             }
         }while (userChoice < 0);
    }

    public int gameMenu(){
        String gameInfo = "***Welcome to Snakes and Ladders!***" +
                "\n\n This virtual version of Snakes and Ladders will be " +
                "\n using 2 dice via A RandomNumberGenerator." +
                "\n when the dice is rolled, your number will be automatically added and " +
                "\n the game will either tell you where you've landed. " +
                "\n for example: Player One has landed on A ladder: spot moved: 45" +
                "\n Player one has landed on A snake: spot moved: 21." +
                "\n Player one: spot moved: 37" +
                "\n\n please select the number of players:" +
                "\n1 = One player\n2 = Two players\n3 = Three players\n4 = Four players\n0 = Exit Game\n\n";

        int minOption = 1;
        int maxOption = 4;

        return promptForInt(gameInfo, minOption, maxOption);

    }

    private int promptForInt(String prompt, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("The min cannot be greater than the max. min: " + min + ", max: " + max);
        }
        int userNum = -1;
        String input = null;
        boolean isInvalid = true;
        do {
            System.out.print(prompt);
            try {
                input = reader.readLine();
                userNum = Integer.parseInt(input);
                isInvalid = userNum < min || userNum > max;
            } catch (IOException ioe) {
                System.out.println("Whoa! Something technical went wrong. Let's try that again.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a numeric value.");
            }
            if (isInvalid) {
                System.out.println("You entered an invalid value. Please, try again.");
            }
        } while (isInvalid);
        return userNum;
    }



}
