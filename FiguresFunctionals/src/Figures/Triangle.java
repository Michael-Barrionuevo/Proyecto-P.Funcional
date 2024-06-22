package Figures;

import Interfaz.Drawable;

import java.awt.*;

public class Triangle {

    public static Drawable draw() {
        return g -> {
            g.setColor(Color.RED);
            int[] xPoints = {300, 400, 500};
            int[] yPoints = {500, 300, 500};
            int nPoints = 3;

            g.fillPolygon(xPoints, yPoints, nPoints);
        };
    }
}
