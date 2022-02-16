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
        else if(playerCounter == 2){
            playerTwoTurn();
        }
        else if(playerCounter == 3){
            playerThreeTurn();
        }
        else{
            playerFourTurn();
        }
    }

   public void playerOneTurn() throws IOException {
       System.out.println(playerOne + " please press ENTER to roll for your turn");
       reader.readLine();

       int diceAmount = diceRoll();

       System.out.println(diceAmount);

       this.playerOneScore = invisibleGameBoard(playerOneScore + diceAmount);

       System.out.println("location: " + invisibleGameBoard(playerOneScore));

     //  playerOneTurn();//this just re-runs playOne for testing... make sure to delete this aye

       playerTurn();
    }

    public void playerTwoTurn() throws IOException {
        System.out.println(playerTwo + " please press ENTER to roll for your turn");
        reader.readLine();

        int diceAmount = diceRoll();

        System.out.println(diceAmount);

        this.playerTwoScore = invisibleGameBoard(playerTwoScore + diceAmount);

        System.out.println("location: " + invisibleGameBoard(playerTwoScore));

        playerTurn();
    }

    public void playerThreeTurn() throws IOException {
        System.out.println(playerThree + " please press ENTER to roll for your turn");
        reader.readLine();

        int diceAmount = diceRoll();

        System.out.println(diceAmount);

        this.playerThreeScore = invisibleGameBoard(playerThreeScore + diceAmount);



        System.out.println("location: " + invisibleGameBoard(playerThreeScore));

        playerTurn();
    }

    public void playerFourTurn() throws IOException {
        System.out.println(playerFour + " please press ENTER to roll for your turn");
        reader.readLine();

        int diceAmount = diceRoll();

        System.out.println(diceAmount);

        this.playerFourScore = invisibleGameBoard(playerFourScore + diceAmount);

        System.out.println("location: " + invisibleGameBoard(playerFourScore));

        playerCounter = 0;
        playerTurn();
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

        int score = playerScore;



        int[] board = new int[100];
        board[1] = 1;
        board[2] = 38;
        board[3] = 3;
        board[4] = 14;
        board[5] = 5;
        board[6] = 6;
        board[7] = 7;
        board[8] = 8;
        board[9] = 31;
        board[10] = 10;
        board[11] = 11;
        board[12] = 12;
        board[13] = 13;
        board[14] = 14;
        board[15] = 15;
        board[16] = 16;
        board[17] = 17;
        board[18] = 18;
        board[19] = 19;
        board[20] = 20;
        board[21] = 21;
        board[22] = 22;
        board[23] = 23;
        board[24] = 24;
        board[25] = 25;
        board[26] = 26;
        board[27] = 27;
        board[28] = 28;
        board[29] = 29;
        board[30] = 30;
        board[31] = 31;
        board[32] = 32;
        board[33] = 85;
        board[34] = 34;
        board[35] = 35;
        board[36] = 36;
        board[37] = 37;
        board[38] = 38;
        board[39] = 39;
        board[40] = 40;
        board[41] = 41;
        board[42] = 42;
        board[43] = 43;
        board[44] = 44;
        board[45] = 45;
        board[46] = 46;
        board[47] = 47;
        board[48] = 48;
        board[49] = 49;
        board[50] = 50;
        board[51] = 11;
        board[52] = 88;
        board[53] = 53;
        board[54] = 54;
        board[55] = 55;
        board[56] = 15;
        board[57] = 57;
        board[58] = 58;
        board[59] = 59;
        board[60] = 60;
        board[61] = 61;
        board[62] = 57;
        board[63] = 63;
        board[64] = 64;
        board[65] = 65;
        board[66] = 66;
        board[67] = 67;
        board[68] = 68;
        board[69] = 69;
        board[70] = 70;
        board[71] = 71;
        board[72] = 72;
        board[73] = 73;
        board[74] = 74;
        board[75] = 75;
        board[76] = 76;
        board[77] = 77;
        board[78] = 78;
        board[79] = 79;
        board[80] = 98;
        board[81] = 81;
        board[82] = 82;
        board[83] = 83;
        board[84] = 84;
        board[85] = 85;
        board[86] = 86;
        board[87] = 87;
        board[88] = 88;
        board[89] = 89;
        board[90] = 90;
        board[91] = 91;
        board[92] = 92;
        board[93] = 93;
        board[94] = 94;
        board[95] = 95;
        board[96] = 96;
        board[97] = 97;
        board[98] = 98;
        board[99] = 8;



        return board[score];

    }
}
