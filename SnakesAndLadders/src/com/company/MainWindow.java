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

    public MainWindow(){
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Controller con = new Controller();
                try {
                    con.run();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
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
    }

    public static void main(String[] args) throws IOException{

        MainWindow window = new MainWindow();
    }


}
