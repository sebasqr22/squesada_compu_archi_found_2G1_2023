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
public class JPanel_Uniciclo extends JLabel {
    private int x,y;

    public JPanel_Uniciclo(JPanel panel) {
        this.x=panel.getWidth();
        this.y=panel.getHeight();
        this.setSize(x,y);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d=(Graphics2D)g;
        BasicStroke grosor=new BasicStroke(5);
        g2d.setStroke(grosor);
        g2d.setColor(Color.BLUE);
        
        g2d.drawLine(5, 5, 50, 5);
    }   
    
}
