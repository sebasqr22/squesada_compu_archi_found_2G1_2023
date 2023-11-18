/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio RC
 */
public class LineLabel extends JLabel {
    private int width, height, x1, y1, x2, y2;
    private Color color = Color.BLACK;

    public LineLabel(JPanel panel, int x1, int y1, int x2, int y2) {
        this.width = panel.getWidth();
        this.height = panel.getHeight();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.setSize(width, height);
    }
    
    public void resaltarLinea(){
        this.color = Color.GREEN;
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
        BasicStroke grosor=new BasicStroke(5);
        g2d.setStroke(grosor);
        g2d.setColor(this.color);
        
        g2d.drawLine(x1, y1, x2, y2);
    }   
}
