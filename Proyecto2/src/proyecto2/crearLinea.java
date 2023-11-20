/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author sebastianqr.2208
 */
public class crearLinea extends JPanel{
    private Graphics2D g2d;
    private List<segmento> lineas;
    private Color lineColor;
    
    public crearLinea(){
        lineas = new ArrayList<>();
        lineColor = Color.BLACK;
    }
    
    public void agregarSegmento(int x1, int y1, int x2, int y2){
        lineas.add(new segmento(x1, y1, x2, y2));
        repaint();
    }

    public void cambiarColor(Color color) {
        lineColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Establecer el color de las líneas
        g.setColor(lineColor);
        // Dibujar todas las líneas en la lista
        for (segmento segment : lineas) {
            g.drawLine(segment.getX1(), segment.getY1(), segment.getX2(), segment.getY2());
        }
    }

    private static class segmento{
        private final int x1, y1, x2, y2;

        public segmento(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public int getX1() {
            return x1;
        }

        public int getY1() {
            return y1;
        }

        public int getX2() {
            return x2;
        }

        public int getY2() {
            return y2;
        }
    }
}
