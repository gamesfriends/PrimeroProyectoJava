/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.primerproyecto;

/**
 *
 * @author psalvi
 */
public class Provincias {
    private final int cantProvinciasMax = 7;
    private final String[] provincias = new String[23];
    private final int[] temperaturas = new int[23];
    private final String[] provTemps = new String[cantProvinciasMax * 2];
    
    public Provincias() {
        provincias[0] = "Jujuy";
        provincias[1] = "Salta";
        provincias[2] = "Tucuman";
        provincias[3] = "Catamarca";
        provincias[4] = "Santiago del estero";
        provincias[5] = "Chaco";
        provincias[6] = "Formosa";
        provincias[7] = "Misiones";
        provincias[8] = "Corrientes";
        provincias[9] = "Cordoba";
        provincias[10] = "Santa Fe";
        provincias[11] = "Entre Rios";
        provincias[12] = "La Rioja";
        provincias[13] = "San Juan";
        provincias[14] = "San Luis";
        provincias[15] = "Mendoza";
        provincias[16] = "La Pampa";
        provincias[17] = "Buenos Aires";
        provincias[18] = "Neuquen";
        provincias[19] = "Rio Negro";
        provincias[20] = "Chubut";
        provincias[21] = "Santa Cruz";
        provincias[22] = "Tierra del fuego";
        
        temperaturas[0] = 35;
        temperaturas[1] = 29;
        temperaturas[2] = 27;
        temperaturas[3] = 22;
        temperaturas[4] = 24;
        temperaturas[5] = 28;
        temperaturas[6] = 30;
        temperaturas[7] = 32;
        temperaturas[8] = 25;
        temperaturas[9] = 20;
        temperaturas[10] = 18;
        temperaturas[11] = 19;
        temperaturas[12] = 22;
        temperaturas[13] = 26;
        temperaturas[14] = 14;
        temperaturas[15] = 10;
        temperaturas[16] = 17;
        temperaturas[17] = 23;
        temperaturas[18] = 12;
        temperaturas[19] = 15;
        temperaturas[20] = 10;
        temperaturas[21] = 6;
        temperaturas[22] = 5;
    }
    
    public void program() {
        mayorArray();
        
        for (int i = 0; i < cantProvinciasMax * 2; i++) {
            System.out.println(provTemps[i]);
        }
    }
    
    private void mayorArray() {
        int provGuardar = 0;
        int[] datos = new int[2];
        
        for (int j = 0; j < this.cantProvinciasMax; j++) {
            datos = provinceMaxTemp();
            
            provTemps[provGuardar] = provincias[datos[1]];
            provTemps[provGuardar+1] = Integer.toString(datos[0]);
            provGuardar +=2;
            
            temperaturas[datos[1]] = 999;
        }
    }

    private int[] provinceMaxTemp() {
        int[] temp_pos = new int[2];
        
        temp_pos[0] = 0;
        //temp_pos[0] = proximoNumeroComparar();
        
        for (int i = 0; i < 23; i++) {
            if (temperaturas[i] != 999 && 
                        temperaturas[i] >= temp_pos[0]) {
                temp_pos[0] = temperaturas[i];
                temp_pos[1] = i;
            }
        }
        return temp_pos;
    }

    private int proximoNumeroComparar() {
        int tempComparar = 0;
        for (int i = 0; i < 10; i++) {
            if (temperaturas[i] != 999) {
                tempComparar = temperaturas[i];
                break;
            }
        }
        return tempComparar;
    }
}
