package model;

import javax.swing.*;

public class Bomb extends HoleOccupant {

    @Override
    public int whack() {
        hide();
        return -500;
    }

    @Override
    public ImageIcon getImage() {
        return new ImageIcon("images/bomb.png");
    }
}