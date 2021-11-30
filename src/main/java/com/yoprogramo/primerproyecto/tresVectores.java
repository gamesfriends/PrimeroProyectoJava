/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.primerproyecto;

/**
 *
 * @author psalvi
 */
public class tresVectores {
    private final String dnis[] = new String[3];
    private final String nombres[] = new String[3];
    private final String apellidos[] = new String[3];
    
    public tresVectores() {
        dnis[0] = "31.456.789";
        dnis[1] = "31.879.546";
        dnis[2] = "31.125.658";
        
        nombres[0] = "Critiano";
        nombres[1] = "Andrea";
        nombres[2] = "Robert";

        apellidos[0] = "Ronaldo";
        apellidos[1] = "Pirlo";
        apellidos[2] = "Lewandowski";
    }
    
    public void program() {
        String texto;
        for (int i = 0; i < 3; i++) {
            texto = "El dni " + dnis[i] + " es de " + nombres[i]
                    + " " + apellidos[i];
            System.out.println(texto);
        }
    }
}
