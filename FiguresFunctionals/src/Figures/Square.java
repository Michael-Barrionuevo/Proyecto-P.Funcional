package Figures;

import Interfaz.Drawable;

import java.awt.*;

public class Square {

    public static Drawable draw() {
        return g -> {
            g.setColor(Color.GREEN);
            g.fillRect(250, 250, 250, 250);
        };
    }
}
