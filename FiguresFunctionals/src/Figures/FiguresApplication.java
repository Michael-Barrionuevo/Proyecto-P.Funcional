package Figures;

import Interfaz.Drawable;

import  javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FiguresApplication extends JFrame{

    private Map<String, Drawable> figures = new HashMap<>();
    private Drawable currentFigure;

    public FiguresApplication(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);

        JPanel panel = new JPanel();
        JButton triangleButton = new JButton("Triángulo");
        JButton squareButton = new JButton("Cuadrado");
        JButton circleButton = new JButton("Círculo");

        figures.put("Triángulo", Triangle.draw());
        figures.put("Cuadrado", Square.draw());
        figures.put("Círculo", Circle.draw());

        triangleButton.addActionListener(e -> setFigure("Triángulo"));
        squareButton.addActionListener(e -> setFigure("Cuadrado"));
        circleButton.addActionListener(e -> setFigure("Círculo"));

        panel.add(triangleButton);
        panel.add(squareButton);
        panel.add(circleButton);

        getContentPane().add(panel, BorderLayout.NORTH);
    }

    private void setFigure(String figureName) {
        currentFigure = figures.get(figureName);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (currentFigure != null) {
            currentFigure.draw(g);
        }
    }

    public void run() {
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
    }

}
