package model;

import javax.swing.*;

public abstract class HoleOccupant {

    protected boolean visible;
    protected int lifeTime;

    public HoleOccupant() {
        visible = true;
        lifeTime = 3;
    }

    public boolean isVisible() {
        return visible;
    }

    public void hide() {
        visible = false;
    }

    public void tick() {
        lifeTime--;

        if (lifeTime <= 0) {
            hide();
        }
    }

    public abstract int whack();

    public abstract ImageIcon getImage();
}