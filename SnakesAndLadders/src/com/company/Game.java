package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    Player playerOne;
    Player playerTwo;
    Player playerThree;
    Player playerFour;
    Player winner;

    int playerCounter = 1;

    boolean playerRolled = false;

    public Game(Player playerOne, Player playerTwo, Player playerThree, Player playerFour) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerThree = playerThree;
        this.playerFour = playerFour;
    }

    public int getPlayerCounter() {
        return playerCounter;
    }

    public void playGame() throws IOException{
        playerTurn();
    }

    public void incrementCounter() {
        playerRolled = false;
        switch(playerCounter) {
            case 1:
                playerCounter = 2;
                break;
            case 2:
                playerCounter = 3;
                break;
            case 3:
                playerCounter = 4;
                break;
            case 4:
                playerCounter = 1;
                break;
            default:
                System.out.println("error occurred when incrementing counter");
                playerRolled = true;
                break;
        }
    }

    private void playerTurn() throws IOException{
        if(playerCounter == 1){
            playerOneTurn();
            playerRolled = true;
        }
        else if(playerCounter == 2){
            playerTwoTurn();
            playerRolled = true;
        }
        else if(playerCounter == 3){
            playerThreeTurn();
            playerRolled = true;
        }
        else{
            playerFourTurn();
            playerRolled = true;
        }
    }

   private void playerOneTurn() throws IOException {
        if (playerRolled) {
            playerOne.setMessage("Cheater!");
        } else {
            System.out.println(playerOne.getName() + " please press ENTER to roll for your turn");

            int diceAmount = diceRoll();

            System.out.println(diceAmount);

            int spotLanded = invisibleGameBoard(playerOne.getScore() + diceAmount);
            System.out.println(spotLanded);

            playerOne.setScore(spotLanded);

            playerOne.setMessage(playerOne.getName() + " rolled " + diceAmount + " and landed in " + playerOne.getScore());
        }

    }

    private void playerTwoTurn() throws IOException {
        if (playerRolled) {
            playerTwo.setMessage("Cheater!");
        } else {
            System.out.println(playerTwo.getName() + " please press ENTER to roll for your turn");

            int diceAmount = diceRoll();

            System.out.println(diceAmount);

            int spotLanded = invisibleGameBoard(playerTwo.getScore() + diceAmount);
            System.out.println(spotLanded);

            playerTwo.setScore(spotLanded);

            playerTwo.setMessage(playerTwo.getName() + " rolled " + diceAmount + " and landed in " + playerTwo.getScore());
        }

    }

    private void playerThreeTurn() throws IOException {
        if (playerRolled) {
            playerOne.setMessage("Cheater!");
        } else {
            System.out.println(playerThree.getName() + " please press ENTER to roll for your turn");

            int diceAmount = diceRoll();

            System.out.println(diceAmount);

            int spotLanded = invisibleGameBoard(playerThree.getScore() + diceAmount);
            System.out.println(spotLanded);

            playerThree.setScore(spotLanded);

            playerThree.setMessage(playerThree.getName() + " rolled " + diceAmount + " and landed in " + playerThree.getScore());
        }

    }

    private void playerFourTurn() throws IOException {
        if (playerRolled) {
            playerFour.setMessage("Cheater!");
        } else {
            System.out.println(playerFour.getName() + " please press ENTER to roll for your turn");

            int diceAmount = diceRoll();

            System.out.println(diceAmount);


            int spotLanded = invisibleGameBoard(playerFour.getScore() + diceAmount);
            System.out.println(spotLanded);

            playerFour.setScore(spotLanded);

            playerFour.setMessage(playerFour.getName() + " rolled " + diceAmount + " and landed in " + playerFour.getScore());
        }
    }

    public String getPlayerMessage() {
        String message = "";

        switch(playerCounter) {
            case 1:
                message = playerOne.getMessage();
                break;
            case 2:
                message = playerTwo.getMessage();
                break;
            case 3:
                message = playerThree.getMessage();
                break;
            case 4:
                message = playerFour.getMessage();
                break;
            default:
                System.out.println("error occurred when retrieving message");
                message = "error";
                break;
        }
        return message;
    }

    public String getPlayerSpot() {
        int spot = 0;
        String message = "";
        switch(playerCounter) {
            case 1:
                spot = playerOne.getScore();
                message = playerOne.getName() + ": " + spot;
                break;
            case 2:
                spot = playerTwo.getScore();
                message = playerTwo.getName() + ": " + spot;
                break;
            case 3:
                spot = playerThree.getScore();
                message = playerThree.getName() + ": " + spot;
                break;
            case 4:
                spot = playerFour.getScore();
                message = playerFour.getName() + ": " + spot;
                break;
            default:
                System.out.println("error occurred when retrieving message");
                message = "error";
                break;
        }
        return message;
    }

    private int diceRoll(){
        Random random = new Random();
        int min = 1;
        int max = 7;

        int rand1 = random.nextInt(max - min) + 1;
        int rand2 = random.nextInt(max - min) + 1;

        return rand1 + rand2;
    }

    private int invisibleGameBoard(int playerScore){

        int score = playerScore - 1;

        int[] board = new int[100];
        board[0] = 1;
        board[1] = 38;
        board[2] = 3;
        board[3] = 14;
        board[4] = 5;
        board[5] = 6;
        board[6] = 7;
        board[7] = 8;
        board[8] = 31;
        board[9] = 10;
        board[10] = 11;
        board[11] = 12;
        board[12] = 13;
        board[13] = 14;
        board[14] = 15;
        board[15] = 16;
        board[16] = 17;
        board[17] = 18;
        board[18] = 19;
        board[19] = 20;
        board[20] = 21;
        board[21] = 22;
        board[22] = 23;
        board[23] = 24;
        board[24] = 25;
        board[25] = 26;
        board[26] = 27;
        board[27] = 28;
        board[28] = 29;
        board[29] = 30;
        board[30] = 31;
        board[31] = 32;
        board[32] = 85;
        board[33] = 34;
        board[34] = 35;
        board[35] = 36;
        board[36] = 37;
        board[37] = 38;
        board[38] = 39;
        board[39] = 40;
        board[40] = 41;
        board[41] = 42;
        board[42] = 43;
        board[43] = 44;
        board[44] = 45;
        board[45] = 46;
        board[46] = 47;
        board[47] = 48;
        board[48] = 49;
        board[49] = 50;
        board[50] = 11;
        board[51] = 88;
        board[52] = 53;
        board[53] = 54;
        board[54] = 55;
        board[55] = 15;
        board[56] = 57;
        board[57] = 58;
        board[58] = 59;
        board[59] = 60;
        board[60] = 61;
        board[61] = 57;
        board[62] = 63;
        board[63] = 64;
        board[64] = 65;
        board[65] = 66;
        board[66] = 67;
        board[67] = 68;
        board[68] = 69;
        board[69] = 70;
        board[70] = 71;
        board[71] = 72;
        board[72] = 73;
        board[73] = 74;
        board[74] = 75;
        board[75] = 76;
        board[76] = 77;
        board[77] = 78;
        board[78] = 79;
        board[79] = 99;
        board[80] = 81;
        board[81] = 82;
        board[82] = 83;
        board[83] = 84;
        board[84] = 85;
        board[85] = 86;
        board[86] = 87;
        board[87] = 88;
        board[88] = 89;
        board[89] = 90;
        board[90] = 91;
        board[91] = 53;
        board[92] = 93;
        board[93] = 94;
        board[94] = 95;
        board[95] = 96;
        board[96] = 97;
        board[97] = 8;
        board[98] = 99;
        board[99] = 100;

        return board[score];

    }
}
