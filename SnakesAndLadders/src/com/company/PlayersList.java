package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayersList {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Player firstPlayer = new Player("Ron");
    Player secondPlayer = new Player("Alex");
    Player thirdPlayer = new Player("Taylor");
    Player fourthPlayer = new Player("Steven");


    public void createPlayers() throws IOException {

        new Game(firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);

    }


}
