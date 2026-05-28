package main;

import javax.swing.*;

public class GameEngine implements Runnable {

    private GamePanel panel;

    private boolean running = true;

    public GameEngine(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {

        while(running) {

            try {

                SwingUtilities.invokeLater(() -> {

                    panel.spawnRandomOccupant();

                    panel.updateTimer();
                });

                Thread.sleep(1000);

            }
            catch (InterruptedException e) {

                running = false;

                System.out.println("Game thread stopped");
            }
        }
    }
}