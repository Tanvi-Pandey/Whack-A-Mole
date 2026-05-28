package model;

import javax.swing.*;
import java.awt.Image;

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
