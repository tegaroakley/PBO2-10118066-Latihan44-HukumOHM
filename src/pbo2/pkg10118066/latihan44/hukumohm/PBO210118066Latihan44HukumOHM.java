/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Baterai();
        Baterai baterai = new Baterai(3, 12);
        
        System.out.println("Kuat Arus      : "+baterai.getKuatArus()+" ampere");
        System.out.println("Hambatan       : "+baterai.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan()+" volt");
    }
    
}
