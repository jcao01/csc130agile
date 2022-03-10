package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainWindow extends JFrame{

    private JPanel panel1;
    private JButton btnStart;
    private JTextField playername1;
    private JButton btnExit;
    private JLabel board;
    private JButton nextTurnButton;
    private JButton rollButton;
    private JLabel gameStatus;
    private JLabel playerOneScore;
    private JLabel playerTwoScore;
    private JLabel playerThreeScore;
    private JLabel playerFourScore;

    Controller con = new Controller();

    public MainWindow(){
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                con.startGame();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("close");
                setVisible(false);
                dispose();
            }
        });

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    con.play();
                    gameStatus.setText(con.getMessage());
                    switch(con.getTurn()) {
                        case 1:
                            playerOneScore.setText(con.getScore());
                            break;
                        case 2:
                            playerTwoScore.setText(con.getScore());
                            break;
                        case 3:
                            playerThreeScore.setText(con.getScore());
                            break;
                        case 4:
                            playerFourScore.setText(con.getScore());
                            break;
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        nextTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con.nextPlayer();
            }
        });
    }

    public static void main(String[] args) throws IOException{

        MainWindow window = new MainWindow();
    }


}
