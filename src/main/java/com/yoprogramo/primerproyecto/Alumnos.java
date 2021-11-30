/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.primerproyecto;

/**
 *
 * @author psalvi
 */
public class Alumnos {
    private final int edades[] = new int[15];
    
    public Alumnos() {
        edades[0] = 10;   // 1
        edades[1] = 18;   // 2
        edades[2] = 17;   // 3
        edades[3] = 55;   // 4
        edades[4] = 60;   // 5
        edades[5] = 10;   // 6
        edades[6] = 55;   // 7
        edades[7] = 22;   // 8
        edades[8] = 2;    // 9
        edades[9] = 4;    // 10
        edades[10] = 70;  // 11
        edades[11] = 51;  // 12
        edades[12] = 29;  // 13
        edades[13] = 36;  // 14
        edades[14] = 1;   // 15
    }
    
    public void program() {
        muestraArray();
        System.out.println("");
        System.out.println("El numero menor del array es: " + menorArray());
        System.out.println("El numero mayor del array es: " + mayorArray());
    }
    
    private void muestraArray() {
        System.err.println("Los numeros ingresados son:");
        for (int i = 0; i < 15; i++) {
            System.out.print(" " + edades[i]);
        }
    }
    
    private int menorArray() {
        int numeroAComparar = edades[0];
        for (int i = 1; i < 15; i++) {
            if (edades[i] < numeroAComparar) {
                numeroAComparar = edades[i];
            }
        }
        return numeroAComparar;
    }
    
    private int mayorArray() {
        int numeroAComparar = edades[0];
        for (int i = 1; i < 15; i++) {
            if (edades[i] > numeroAComparar) {
                numeroAComparar = edades[i];
            }
        }
        return numeroAComparar;
    }
}
