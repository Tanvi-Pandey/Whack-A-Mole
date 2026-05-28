package main;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {

    JButton[] holes = new JButton[9];

    HoleOccupant[] occupants = new HoleOccupant[9];

    JLabel scoreLabel;
    JLabel timerLabel;

    int score = 0;
    int timeLeft = 30;

    public GamePanel() {

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        scoreLabel = new JLabel("Score: 0");
        timerLabel = new JLabel("Time: 30");

        topPanel.add(scoreLabel);
        topPanel.add(timerLabel);

        add(topPanel, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridLayout(3,3));

        for(int i = 0; i < 9; i++) {

            JButton button = new JButton();

            button.setFocusPainted(false);
            button.setContentAreaFilled(true);
            button.setBorderPainted(true);

            holes[i] = button;

            int index = i;

            button.addActionListener(e -> whack(index));

            gridPanel.add(button);
        }

        add(gridPanel, BorderLayout.CENTER);

        GameEngine engine = new GameEngine(this);

        Thread gameThread = new Thread(engine);

        gameThread.start();
    }

    public void whack(int index) {

        if(occupants[index] != null &&
                occupants[index].isVisible()) {

            score += occupants[index].whack();

            scoreLabel.setText("Score: " + score);

            holes[index].setIcon(null);

            occupants[index] = null;
        }
    }

    public void spawnRandomOccupant() {

        Random random = new Random();

        int index = random.nextInt(9);

        if(occupants[index] != null) {
            return;
        }

        int type = random.nextInt(3);

        HoleOccupant occupant;

        if(type == 0) {
            occupant = new Mole();
        }
        else if(type == 1) {
            occupant = new Bomb();
        }
        else {
            occupant = new BonusMole();
        }

        occupants[index] = occupant;

        holes[index].setText("");

        holes[index].setIcon(occupant.getImage());

        holes[index].revalidate();

        holes[index].repaint();
    }

    public void updateTimer() {

        timeLeft--;

        timerLabel.setText("Time: " + timeLeft);

        if(timeLeft <= 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Game Over! Score: " + score
            );

            System.exit(0);
        }
    }
}

