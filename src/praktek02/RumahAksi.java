/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author Acer
 */
public class RumahAksi {
    public static void main(String[] args) {
        
        Rumah S1 = new Rumah();
        S1.panjang = 22;
        S1.lebar = 33;
        
        S1.cetakInfo();
        System.out.println("Luas Rumah = "+S1.hitungLuas());
        S1.cetakLuasRumah();
        
        Rumah S2 = new Rumah ();
        S2.cetakInfo();
        
        Rumah S3 = new Rumah(90,80);
        S3.cetakInfo();
        
    }
}
