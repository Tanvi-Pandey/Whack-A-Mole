package model;

import javax.swing.*;
import java.awt.Image;

public class Bomb extends HoleOccupant {

    @Override
    public int whack() {

        hide();
        return -500;
    }

    @Override
    public ImageIcon getImage() {

        ImageIcon icon =
                new ImageIcon("images/bomb.png");

        Image img =
                icon.getImage().getScaledInstance(
                        80,
                        80,
                        Image.SCALE_SMOOTH
                );

        return new ImageIcon(img);
    }
}

