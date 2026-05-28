package main;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        setTitle("Whack A Mole");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new GamePanel());

        setVisible(true);
    }
}
