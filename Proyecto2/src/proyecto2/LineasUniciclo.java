/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author erick
 */
public class LineasUniciclo {
    
    private JPanel panel_uniciclo;
    
    private LineLabel mas4_Pc;
    private LineLabel pcTarget_Pc;
    
    private LineLabel pc_Imemoria;
    
    private LineLabel memoria_deco;
    
    private LineLabel deco_registro1;
    private LineLabel deco_registro2;
    private LineLabel deco_registro3; 
    
    private ArrayList<LineLabel> deco_imm = new ArrayList<>();
    private LineLabel deco_imm1;
    private LineLabel deco_imm2;
    private LineLabel deco_imm3;  
    
    private ArrayList<LineLabel> imm_ALU = new ArrayList<>();
    private LineLabel imm_ALU_1;
    private LineLabel imm_ALU_2;
    private LineLabel imm_ALU_3;
    
    private LineLabel ALU_Registro_1;
    private LineLabel ALU_Registro_2;
    
    private ArrayList<LineLabel> registro_memD = new ArrayList<>();
    private LineLabel registro_memD_1;
    private LineLabel registro_memD_2;
    private LineLabel registro_memD_3;
    private LineLabel registro_memD_4;
    private LineLabel registro_memD_5;
    
    private LineLabel ALU_memD;
    
    private ArrayList<LineLabel> memD_reg = new ArrayList<>();
    private LineLabel memD_reg_1;
    private LineLabel memD_reg_2;
    private LineLabel memD_reg_3;
    private LineLabel memD_reg_4;
    private LineLabel memD_reg_5;

    
        
    public LineasUniciclo(JPanel panel_uniciclo){
        this.panel_uniciclo = panel_uniciclo;
        
        this.mas4_Pc = new LineLabel(panel_uniciclo, 60, 140, 100, 140);
        this.panel_uniciclo.add(this.mas4_Pc);
        
        this.pcTarget_Pc = new LineLabel(panel_uniciclo, 60, 180, 100, 180);
        this.panel_uniciclo.add(this.pcTarget_Pc);
        
        this.pc_Imemoria = new LineLabel(panel_uniciclo, 190, 160, 240, 160); 
        this.panel_uniciclo.add(this.pc_Imemoria);
        
        this.memoria_deco = new LineLabel(panel_uniciclo, 290, 160, 360, 160); 
        this.panel_uniciclo.add(this.memoria_deco);
        
        this.deco_registro1 = new LineLabel(panel_uniciclo, 440, 140, 550, 140); 
        this.panel_uniciclo.add(this.deco_registro1);
        
        this.deco_registro2 = new LineLabel(panel_uniciclo, 440, 160, 550, 160); 
        this.panel_uniciclo.add(this.deco_registro2);
        
        this.deco_registro3 = new LineLabel(panel_uniciclo, 440, 180, 550, 180); 
        this.panel_uniciclo.add(this.deco_registro3);
        
        this.deco_imm1 = new LineLabel(panel_uniciclo, 440, 200, 490, 200); 
        this.panel_uniciclo.add(this.deco_imm1);
        
        this.deco_imm2 = new LineLabel(panel_uniciclo, 490, 200, 490, 285); 
        this.panel_uniciclo.add(this.deco_imm2);
        
        this.deco_imm3 = new LineLabel(panel_uniciclo, 490, 285, 550, 285); 
        this.panel_uniciclo.add(this.deco_imm3);
        
        this.deco_imm.add(deco_imm1);
        this.deco_imm.add(deco_imm2);
        this.deco_imm.add(deco_imm3);
        
        this.imm_ALU_1 = new LineLabel(panel_uniciclo, 600, 285, 680, 285); 
        this.panel_uniciclo.add(this.imm_ALU_1);
        
        this.imm_ALU_2 = new LineLabel(panel_uniciclo, 680, 285, 680, 200); 
        this.panel_uniciclo.add(this.imm_ALU_2);
        
        this.imm_ALU_3 = new LineLabel(panel_uniciclo, 680, 200, 730, 200); 
        this.panel_uniciclo.add(this.imm_ALU_3);
        
        this.imm_ALU.add(imm_ALU_1);
        this.imm_ALU.add(imm_ALU_2);
        this.imm_ALU.add(imm_ALU_3);        
        
        this.ALU_Registro_1 = new LineLabel(panel_uniciclo, 640, 160, 730, 160); 
        this.panel_uniciclo.add(this.ALU_Registro_1);
        
        this.ALU_Registro_2 = new LineLabel(panel_uniciclo, 640, 180, 730, 180); 
        this.panel_uniciclo.add(this.ALU_Registro_2);
        
        this.registro_memD_1 = new LineLabel(panel_uniciclo, 640, 140, 680, 140); 
        this.panel_uniciclo.add(this.registro_memD_1);
        
        this.registro_memD_2 = new LineLabel(panel_uniciclo, 680, 140, 680, 80);
        this.panel_uniciclo.add(this.registro_memD_2);
        
        this.registro_memD_3 = new LineLabel(panel_uniciclo, 680, 80, 850, 80); 
        this.panel_uniciclo.add(this.registro_memD_3);
        
        this.registro_memD_4 = new LineLabel(panel_uniciclo, 850, 80, 850, 140); 
        this.panel_uniciclo.add(this.registro_memD_4);
        
        this.registro_memD_5 = new LineLabel(panel_uniciclo, 850, 140, 900, 140); 
        this.panel_uniciclo.add(this.registro_memD_5);
        
        this.registro_memD.add(registro_memD_1);
        this.registro_memD.add(registro_memD_2);
        this.registro_memD.add(registro_memD_3);
        this.registro_memD.add(registro_memD_4);
        this.registro_memD.add(registro_memD_5);
        
        this.ALU_memD = new LineLabel(panel_uniciclo, 800, 160, 900, 160); 
        this.panel_uniciclo.add(this.ALU_memD);
        
        this.memD_reg_1 = new LineLabel(panel_uniciclo, 980, 160, 1020, 160); 
        this.panel_uniciclo.add(this.memD_reg_1);
        
        this.memD_reg_2 = new LineLabel(panel_uniciclo, 1020, 160, 1020, 60); 
        this.panel_uniciclo.add(this.memD_reg_2);
        
        this.memD_reg_3 = new LineLabel(panel_uniciclo, 1020, 60, 490, 60); 
        this.panel_uniciclo.add(this.memD_reg_3);
        
        this.memD_reg_4 = new LineLabel(panel_uniciclo, 490, 60, 490, 120); 
        this.panel_uniciclo.add(this.memD_reg_4);
        
        this.memD_reg_5 = new LineLabel(panel_uniciclo, 490, 120, 550, 120); 
        this.panel_uniciclo.add(this.memD_reg_5);
        
        this.panel_uniciclo.repaint();
    }
    
    public void resaltarCamino(ArrayList<LineLabel> camino){
        for(LineLabel linea: camino)
            linea.resaltarLinea();
    }
    
}
