package model;

import javax.swing.*;

public class Mole extends HoleOccupant {

    @Override
    public int whack() {
        hide();
        return 100;
    }

    @Override
    public ImageIcon getImage() {
        return new ImageIcon("images/mole.png");
    }
}