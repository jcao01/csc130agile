package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Players {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String firstPlayer;
    String secondPlayer;
    String thirdPlayer;
    String fourthPlayer;

    String AIPlayerTwo = "Alex";
    String AIPlayerThree = "Taylor";
    String AIPlayerFour = "Steven";


    public void onePlayer() throws IOException {
        System.out.println("Player one please enter your name");
        String playerOne = reader.readLine();
        firstPlayer = playerOne;

        new Game(firstPlayer, AIPlayerTwo, AIPlayerThree, AIPlayerFour);

    }

    public void twoPlayer() throws IOException{
        System.out.println("Player one please enter your name");
        String playerOne = reader.readLine();
        firstPlayer = playerOne;

        System.out.println("player two please enter your name");
        String playerTwo = reader.readLine();
        secondPlayer = playerTwo;

        new Game(firstPlayer, secondPlayer, AIPlayerThree, AIPlayerFour);

    }

    public void threePlayer() throws IOException{
        System.out.println("Player one please enter your name");
        String playerOne = reader.readLine();
        firstPlayer = playerOne;

        System.out.println("player two please enter your name");
        String playerTwo = reader.readLine();
        secondPlayer = playerTwo;

        System.out.println("player three please enter your name");
        String playerThree = reader.readLine();
        thirdPlayer = playerThree;

        new Game(firstPlayer, secondPlayer, thirdPlayer, AIPlayerFour);

    }

    public void fourPlayer() throws IOException{
        System.out.println("Player one please enter your name");
        String playerOne = reader.readLine();
        firstPlayer = playerOne;

        System.out.println("player two please enter your name");
        String playerTwo = reader.readLine();
        secondPlayer = playerTwo;

        System.out.println("player three please enter your name");
        String playerThree = reader.readLine();
        thirdPlayer = playerThree;

        System.out.println("player four please enter your name");
        String playerFour = reader.readLine();
        fourthPlayer = playerFour;

        new Game(firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);

    }


}
