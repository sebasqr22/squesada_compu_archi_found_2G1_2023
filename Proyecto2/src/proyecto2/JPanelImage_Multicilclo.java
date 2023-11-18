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
public class JPanelImage_Multicilclo extends JLabel {
    private int x,y;
    private final String path;

    public JPanelImage_Multicilclo(JPanel panel,String path) {
        this.path = path;
        this.x=panel.getWidth();
        this.y=panel.getHeight();
        this.setSize(x,y);
    }

    @Override
    public void paint(Graphics g) {
        pintarGonito(g,true);
        //ImageIcon img =new ImageIcon(getClass().getResource(path));
        //g.drawImage(img.getImage(), 0, 0, x,y,null);
        
        /*
        Graphics2D g2d=(Graphics2D)g;
        BasicStroke grosor=new BasicStroke(5);
        g2d.setStroke(grosor);
        g2d.setColor(Color.BLUE);
        
        g2d.drawLine(63, 105, 98, 105);
        
        g2d.setColor(Color.GREEN);
        
        g2d.drawLine(63, 25, 40, 105);*/
    }
    
    public void pintarGonito(Graphics g, boolean flag){
        if(flag){
           Graphics2D g2d=(Graphics2D)g;
        BasicStroke grosor=new BasicStroke(5);
        g2d.setStroke(grosor);
        g2d.setColor(Color.BLUE);
        
        g2d.drawLine(63, 105, 98, 105);
        
        g2d.setColor(Color.GREEN);
        
        g2d.drawLine(63, 25, 40, 105); 
        }
        
        
        
    }
    
    
    
}
