package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    String playerOne;
    String playerTwo;
    String playerThree;
    String playerFour;
    int playerOneScore;
    int playerTwoScore;
    int playerThreeScore;
    int playerFourScore;

    int playerCounter = 0;

    public Game(String playerOne, String playerTwo, String playerThree, String playerFour) throws IOException{
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerThree = playerThree;
        this.playerFour = playerFour;

        playGame();
    }

    public void testing(){
        System.out.println(playerOne + " " + playerTwo + " " + playerThree + " " + playerFour);
    }

    public void playGame() throws IOException{
        playerTurn();
    }

    public void playerTurn() throws IOException{
        playerCounter++;
        if(playerCounter == 1){
            playerOneTurn();
        }
    }

   public void playerOneTurn() throws IOException {
       System.out.println(playerOne + " please press ENTER to roll for your turn");
       reader.readLine();

       int diceAmount = diceRoll();

       this.playerOneScore = playerOneScore + diceAmount;

       System.out.println("location: " + invisibleGameBoard(playerOneScore));

       playerOneTurn();

    }


    public int diceRoll(){
        Random random = new Random();
        int min = 1;
        int max = 7;

        int rand1 = random.nextInt(max - min) + 1;
        int rand2 = random.nextInt(max - min) + 1;

        return rand1 + rand2;
    }

    public int invisibleGameBoard(int playerScore){



        int[] board = new int[100];

        if(playerScore == 2) {
            board[2] = board[38]; //Ladder
            playerScore = board[38];
        } else if(playerScore == 4){
            board[4] = board[14]; //ladder
            playerScore = board[14];
        } else if(playerScore == 9) {
            board[9] = board[31]; //ladder
            playerScore = board[31];

        } else if(playerScore == 33) {
            board[33] = board[85]; //ladder
            playerScore = board[85];

        } else if(playerScore == 51) {
            board[51] = board[11]; //snake
            playerScore = board[11];

        } else if(playerScore == 52) {
            board[52] = board[88]; //ladder
            playerScore = board[88];

        } else if(playerScore == 56) {
            board[56] = board[15]; //snake
            playerScore = board[15];

        } else if(playerScore == 62) {
            board[62] = board[57]; //snake
            playerScore = board[57];

        } else if(playerScore == 80) {
            board[80] = board[99]; //ladder
            playerScore = board[99];

        } else if(playerScore == 92) {
            board[92] = board[48]; //snake
            playerScore = board[48];

        } else if(playerScore == 98) {
            board[98] = board[8]; //snake
            playerScore = board[8];

        }

        return playerScore;

    }
}
