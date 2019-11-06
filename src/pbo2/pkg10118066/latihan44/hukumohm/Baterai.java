/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan44.hukumohm;

/**
 *
 * @author PC
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(){
        System.out.println("=====Hukum OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial "
                + "pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan ");
    }
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    public float hitungTegangan(){
        return hambatan * kuatArus;
    }
}
