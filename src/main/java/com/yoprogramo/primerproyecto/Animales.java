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
public class Animales {
    private String animales[] = new String[10];
    private String animalesR[] = new String[10];
    private int cantidadAnimales;
    public Animales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
        //llenadoDePruebaArray();
    }
    
    private void llenadoDePruebaArray() {
        animales[0] = "Perro";
        animales[1] = "Gato";
        animales[2] = "Lagartija";
    }
    
    public void program() {
        Scanner sc = new Scanner(System.in);
        String animal = "";
        int posArray = 0;

        while(posArray < this.cantidadAnimales) {
            System.out.println("Ingrese el nombre del animal a ingresar");

            animal = sc.nextLine();
            
            animales[posArray] = animal;
            
            posArray += 1;
            
        }
        
        armarArrayReversa();
        muestraArray();
    }
    
    private void muestraArray() {
        for (int i = 0; i < this.cantidadAnimales; i++) {
            System.out.print(" " + animales[i]);
        }
        System.out.println("");
        for (int i = 0; i < this.cantidadAnimales; i++) {
            System.out.print(" " + animalesR[i]);
        }
    }

    private void armarArrayReversa() {
        int indexAnimalesR = 0;
        for (int i = this.cantidadAnimales-1; i >= 0; i--) {
            animalesR[indexAnimalesR] = animales[i];
            indexAnimalesR += 1;
        }
    }
}
