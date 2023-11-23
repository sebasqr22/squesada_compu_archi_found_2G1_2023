/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio RC
 */
public class LineasMulticiclo extends JLabel {
    private int x,y;
    private JPanel panel_multiciclo;
    //Lineas para Multi
    private LineLabel mas4_Pc ;
    private LineLabel pcTarget_Pc ;
    private LineLabel pc_memoria ;
    private LineLabel memoria_deco;
    
    private ArrayList<LineLabel> deco_imm= new ArrayList<>();
    private LineLabel deco_imm_1;
    private LineLabel deco_imm_2;
    private LineLabel deco_imm_3;
    
    private ArrayList<LineLabel> imm_ALU= new ArrayList<>();
    private LineLabel imm_ALU_1;
    private LineLabel imm_ALU_2;
    private LineLabel imm_ALU_3;
    
    private ArrayList<LineLabel> ALU_Registro = new ArrayList<>();
    private LineLabel ALU_Registro_1;
    private LineLabel ALU_Registro_2;
    private LineLabel ALU_Registro_3;
    private LineLabel ALU_Registro_4;
    private LineLabel ALU_Registro_5;
    
    private ArrayList<LineLabel> deco_registro= new ArrayList<>();
    private LineLabel deco_registro_1;
    private LineLabel deco_registro_2;
    private LineLabel deco_registro_3;
    
    private ArrayList<LineLabel> registro_ALU= new ArrayList<>();
    private LineLabel registro_ALU_1;
    private LineLabel registro_ALU_2;
    
    
    private ArrayList<LineLabel> memoria_ALU = new ArrayList<>();
    private LineLabel memoria_ALU_1;
    private LineLabel memoria_ALU_2;
    private LineLabel memoria_ALU_3;
    private LineLabel memoria_ALU_4;
    private LineLabel memoria_ALU_5;

    public LineasMulticiclo(JPanel panel_multiciclo) {
        
        this.x=panel_multiciclo.getWidth();
        this.y=panel_multiciclo.getHeight();
        this.setSize(x,y);
        this.panel_multiciclo=panel_multiciclo;
        this.mas4_Pc = new LineLabel(panel_multiciclo, 60, 140, 100, 140);
        this.panel_multiciclo.add(this.mas4_Pc).repaint();
        
        this.pcTarget_Pc = new LineLabel(panel_multiciclo, 80, 190, 100, 190);
        this.panel_multiciclo.add(this.pcTarget_Pc).repaint();
        
        this.pc_memoria = new LineLabel(panel_multiciclo, 200, 165, 265, 165);
        this.panel_multiciclo.add(this.pc_memoria).repaint();
        
        this.memoria_deco = new LineLabel(panel_multiciclo, 375, 165, 435, 165);
        this.panel_multiciclo.add(this.memoria_deco).repaint();
        
        this.deco_imm_1=new LineLabel(panel_multiciclo, 545, 200, 560, 200);
        this.deco_imm.add(this.deco_imm_1);
        this.panel_multiciclo.add(this.deco_imm_1).repaint();
        
        this.deco_imm_2=new LineLabel(panel_multiciclo, 560, 200, 560, 310);
        this.deco_imm.add(this.deco_imm_2);
        this.panel_multiciclo.add(this.deco_imm_2).repaint();
        
        this.deco_imm_3=new LineLabel(panel_multiciclo, 560, 310, 600, 310);
        this.deco_imm.add(this.deco_imm_3);
        this.panel_multiciclo.add(this.deco_imm_3).repaint();
        
        
        this.imm_ALU_1=new LineLabel(panel_multiciclo, 700, 310, 730, 310);
        this.imm_ALU.add(this.imm_ALU_1);
        this.panel_multiciclo.add(this.imm_ALU_1).repaint();
        
        this.imm_ALU_2=new LineLabel(panel_multiciclo, 730, 200, 730, 310);
        this.imm_ALU.add(this.imm_ALU_2);
        this.panel_multiciclo.add(this.imm_ALU_2).repaint();
        
        this.imm_ALU_3=new LineLabel(panel_multiciclo, 730, 200, 770, 200);
        this.imm_ALU.add(this.imm_ALU_3);
        this.panel_multiciclo.add(this.imm_ALU_3).repaint();
        
        
        this.ALU_Registro_1=new LineLabel(panel_multiciclo, 585, 140, 598, 140);
        this.ALU_Registro.add(this.ALU_Registro_1);
        this.panel_multiciclo.add(this.ALU_Registro_1).repaint();
        
        this.ALU_Registro_2=new LineLabel(panel_multiciclo, 585, 140, 585, 105);
        this.ALU_Registro.add(this.ALU_Registro_2);
        this.panel_multiciclo.add(this.ALU_Registro_2).repaint();
        
        this.ALU_Registro_3=new LineLabel(panel_multiciclo, 585, 105, 900, 105);
        this.ALU_Registro.add(this.ALU_Registro_3);
        this.panel_multiciclo.add(this.ALU_Registro_3).repaint();
        
        this.ALU_Registro_4=new LineLabel(panel_multiciclo, 900, 140, 900, 105);
        this.ALU_Registro.add(this.ALU_Registro_4);
        this.panel_multiciclo.add(this.ALU_Registro_4).repaint();
        
        this.ALU_Registro_5=new LineLabel(panel_multiciclo, 880, 140, 900, 140);
        this.ALU_Registro.add(this.ALU_Registro_5);
        this.panel_multiciclo.add(this.ALU_Registro_5).repaint();
        
        this.deco_registro_1=new LineLabel(panel_multiciclo, 545, 155, 600, 155);
        this.deco_registro.add(this.deco_registro_1);
        this.panel_multiciclo.add(this.deco_registro_1).repaint();
        
        this.deco_registro_2=new LineLabel(panel_multiciclo, 545, 165, 600, 165);
        this.deco_registro.add(this.deco_registro_2);
        this.panel_multiciclo.add(this.deco_registro_2).repaint();
        
        this.deco_registro_3=new LineLabel(panel_multiciclo, 545, 175, 600, 175);
        this.deco_registro.add(this.deco_registro_3);
        this.panel_multiciclo.add(this.deco_registro_3).repaint();
        
        this.registro_ALU_1=new LineLabel(panel_multiciclo, 695, 155, 770, 155);
        this.registro_ALU.add(this.registro_ALU_1);
        this.panel_multiciclo.add(this.registro_ALU_1).repaint();
        
        this.registro_ALU_2=new LineLabel(panel_multiciclo, 695, 175, 770, 175);
        this.registro_ALU.add(this.registro_ALU_2);
        this.panel_multiciclo.add(this.registro_ALU_2).repaint();
        
        
        this.memoria_ALU_1=new LineLabel(panel_multiciclo, 250, 215, 265, 215);
        this.memoria_ALU.add(this.memoria_ALU_1);
        this.panel_multiciclo.add(this.memoria_ALU_1).repaint();
        
        this.memoria_ALU_2=new LineLabel(panel_multiciclo, 250, 215, 250, 375);
        this.memoria_ALU.add(this.memoria_ALU_2);
        this.panel_multiciclo.add(this.memoria_ALU_2).repaint();
        
        this.memoria_ALU_3=new LineLabel(panel_multiciclo, 250, 375, 750, 375);
        this.memoria_ALU.add(this.memoria_ALU_3);
        this.panel_multiciclo.add(this.memoria_ALU_3).repaint();
        
        this.memoria_ALU_4=new LineLabel(panel_multiciclo, 750, 375, 750, 215);
        this.memoria_ALU.add(this.memoria_ALU_4);
        this.panel_multiciclo.add(this.memoria_ALU_4).repaint();
        
        this.memoria_ALU_5=new LineLabel(panel_multiciclo, 750, 215, 770, 215);
        this.memoria_ALU.add(this.memoria_ALU_5);
        this.panel_multiciclo.add(this.memoria_ALU_5).repaint();
    }
    
    public void resaltarCamino(ArrayList<LineLabel> camino){
        for(LineLabel linea: camino)
            linea.resaltarLinea();
    }
    
    public void pintarCompleto(){
        ArrayList<LineLabel> camino = new ArrayList<>();
        camino.add(mas4_Pc);
        camino.add(memoria_deco);
        camino.add(deco_imm_1);
        camino.add(deco_imm_2);
        camino.add(deco_imm_3);

        camino.add(pc_memoria);

        
        camino.add(imm_ALU_1);
        camino.add(imm_ALU_2);
        camino.add(imm_ALU_3);

        camino.add(deco_registro_1);
        camino.add(deco_registro_3);

        camino.add(registro_ALU_1);
        camino.add(registro_ALU_2);
        camino.add(ALU_Registro_1);
        camino.add(ALU_Registro_2);
        camino.add(ALU_Registro_3);
        camino.add(ALU_Registro_4);
        camino.add(ALU_Registro_5);

        camino.add(ALU_Registro_2);

        
        resaltarCamino(camino);
        
    }
}
