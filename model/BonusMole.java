package model;

import javax.swing.*;

public class BonusMole extends HoleOccupant {

    @Override
    public int whack() {
        hide();
        return 1000;
    }

    @Override
    public ImageIcon getImage() {
        return new ImageIcon("images/bonus.png");
    }
}
