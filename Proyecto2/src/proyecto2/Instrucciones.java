/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class Instrucciones {
    public String[] instrucciones = {
            "primos: .space 10", // pedir espacio para array primos
            "LI t0, 1", // guardar el numero uno en un registro
            "LA t1, primos", // guardar la direccion del array
            // Inicializar todas las posiciones en 1
            "SB t0, 0(t1)", 
            "SB t0, 1(t1)",
            "SB t0, 2(t1)",
            "SB t0, 3(t1)",
            "SB t0, 4(t1)",
            "SB t0, 5(t1)",
            "SB t0, 6(t1)",
            "SB t0, 7(t1)",
            "SB t0, 8(t1)",
            "SB t0, 9(t1)",
            // Inicializar Registros
            "LI t2 5", // guardar la mitad de n en t2
            "L1 t3 10", // guardar n en t3
            // Loop principal
            "ADDI t0, t0, 1", // t0 = 2
            "ADDI t5, t0, t0", // t5 = 4
            "BGE t0, t2", // t0 > t2 (2 > 5)
            // Loop secundario
            "SB zero, t5(t1)", // array[4] = 0
            "ADD t5, t5, t0", // t5 = 6
            "BGE t5 t3", // t5 > t4 (6 > 10)
            // Loop secundario
            "SB zero, t5(t1)", // array[6] = 0
            "ADD t5, t5, t0", // t5 = 8
            "BGE t5 t3", // t5 > t4 (8 > 10)
            // Loop secundario
            "SB zero, t5(t1)", // array[8] = 0
            "ADD t5, t5, t0", // t5 = 10
            "BGE t5 t3", // t5 > t4 (10 > 10)
            // Loop secundario
            "SB zero, t5(t1)", // array[10] = 0
            "ADD t5, t5, t0", // t5 = 12
            "BGE t5 t3", // t5 > t4 (12 > 10)
            // Loop principal
            "ADDI t0, t0, 1", // t0 = 3
            "ADDI t5, t0, t0", // t5 = 6
            "BGE t0, t2", // t0 > t2 (2 > 5)
            // Loop secundario
            "SB zero, t5(t1)", // array[6] = 0
            "ADD t5, t5, t0", // t5 = 9
            "BGE t5 t3", // t5 > t4 (9 > 10)
            // Loop secundario
            "SB zero, t5(t1)", // array[9] = 0
            "ADD t5, t5, t0", // t5 = 12
            "BGE t5 t3", // t5 > t4 (12 > 10)
            // Loop principal
            "ADDI t0, t0, 1", // t0 = 4
            "ADDI t5, t0, t0", // t5 = 8
            "BGE t0, t2", // t0 > t2 (2 > 5)
            // Loop secundario
            "SB zero, t5(t1)", // array[8] = 0
            "ADD t5, t5, t0", // t5 = 12
            "BGE t5 t3", // t5 > t4 (12 > 10)
            // Loop principal
            "ADDI t0, t0, 1", // t0 = 5
            "ADDI t5, t0, t0", // t0 = 10
            "BGE t0, t2", // t0 > t2 (5 > 5)
            // Loop secundario
            "SB zero, t5(t1)", // array[10] = 0
            "ADD t5, t5, t0", // t5 = 15
            "BGE t5 t3", // t5 > t4 (15 > 10)
            // Loop principal
            "ADDI t0, t0, 1", // t0 = 6
            "ADDI t5, t0, t0", // t0 = 12
            "BGE t0, t2", // t0 > t2 (6 > 5)
        }; // El array contiene 1 en primos y 0 en los demás
    
    
    public Instrucciones(){
        
    }
    
    public void valoresMemoria(javax.swing.JTextArea area){
        String contenido = "0:        00100293        addi x5 x0 1\n" +
"    4:        10000317        auipc x6 0x10000\n" +
"    8:        ffc30313        addi x6 x6 -4\n" +
"\n" +
"0000000c <init>:\n" +
"    c:        00530023        sb x5 0 x6\n" +
"    10:        005300a3        sb x5 1 x6\n" +
"    14:        00530123        sb x5 2 x6\n" +
"    18:        005301a3        sb x5 3 x6\n" +
"    1c:        00530223        sb x5 4 x6\n" +
"    20:        005302a3        sb x5 5 x6\n" +
"    24:        00530323        sb x5 6 x6\n" +
"    28:        005303a3        sb x5 7 x6\n" +
"    2c:        00530423        sb x5 8 x6\n" +
"    30:        005304a3        sb x5 9 x6\n" +
"\n" +
"00000034 <end_init>:\n" +
"    34:        00500393        addi x7 x0 5\n" +
"    38:        00a00e13        addi x28 x0 10\n" +
"\n" +
"0000003c <loop_principal>:\n" +
"    3c:        00128293        addi x5 x5 1\n" +
"    40:        00528f33        add x30 x5 x5\n" +
"    44:        0072da63        bge x5 x7 20 <end>\n" +
"\n" +
"00000048 <loop_secundario>:\n" +
"    48:        00030023        sb x0 0 x6\n" +
"    4c:        005f0f33        add x30 x30 x5\n" +
"    50:        ffcf56e3        bge x30 x28 -20 <loop_principal>\n" +
"    54:        ff5ff06f        jal x0 -12 <loop_secundario>\n" +
"\n" +
"00000058 <end>:\n" +
"    58:        00000013        addi x0 x0 0";
        
        area.setText(contenido);
    }
    
    private void setCompleteTexto(javax.swing.JTextArea area){
        for(String i: instrucciones){
            area.append(i);
            area.append("\n");
        }
    }
    
    public void pintarUnicicloComplete(javax.swing.JTextArea area, LineasUniciclo lineas, javax.swing.JTextArea memoria){
        setCompleteTexto(area);
        lineas.pintarCompleto();
        valoresMemoria(memoria);
    }
    
    
    public void pintarMulticicloComplete(javax.swing.JTextArea area, LineasMulticiclo lineas, javax.swing.JTextArea memoria){
        setCompleteTexto(area);
        lineas.pintarCompleto();
        valoresMemoria(memoria);
    }
    
}
