package model;

import javax.swing.*;
import java.awt.Image;

public class Mole extends HoleOccupant {

    @Override
    public int whack() {

        hide();
        return 100;
    }

@Override
public ImageIcon getImage() {

    System.out.println(
            new java.io.File("images/mole.png").exists()
    );

    ImageIcon icon =
            new ImageIcon("images/mole.png");

    Image img =
            icon.getImage().getScaledInstance(
                    80,
                    80,
                    Image.SCALE_SMOOTH
            );

    return new ImageIcon(img);
}


}
