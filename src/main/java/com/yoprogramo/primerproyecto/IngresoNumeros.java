/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.primerproyecto;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author psalvi
 */
public class IngresoNumeros {
    private final int arrayNumeros[] = new int[10];
    
    public void program() {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado;
        int posArray = 0;

        while(posArray < 10) {
            System.out.println("Ingrese el numero a almacenar para la "
                                + "posicion " + posArray);
            try {
                numeroIngresado = sc.nextInt();
                
                if (numeroIngresado >= 1 && numeroIngresado <= 100) {
                    arrayNumeros[posArray] = numeroIngresado;
                    posArray += 1;
                } else System.out.println("El numero inresado debe estar "
                                            + "entre 1 y 100");
            } catch (InputMismatchException e) {
                System.out.println("Debe ingrear numeros");
                sc.nextLine();
            }
        }
        
        muestraArray();
    }
    
    private void muestraArray() {
        System.out.println("Los numeros ingresados son:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + arrayNumeros[i]);
        }
    }
}
