package Figures;

import Interfaz.Drawable;

import java.awt.*;

public class Circle {

    public static Drawable draw() {
        return g -> {
            g.setColor(Color.BLUE);
            g.fillOval(250, 250, 250, 250);
        };
    }
}
