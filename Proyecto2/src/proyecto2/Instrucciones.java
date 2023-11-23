/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

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
}
