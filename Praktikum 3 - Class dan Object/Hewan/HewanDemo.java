/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author Irwand
 */
public class HewanDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
            hewan1.beriNama("Harimau");
            hewan1.beriJumlahKaki(4);
            hewan1.jenismakanan("Daging");
            hewan1.typehewan("Karnivora");
            hewan1.infoHewan() ;

        Hewan hewan2= new Hewan();
            hewan2.beriNama("Kerbau");
            hewan2.beriJumlahKaki(4);
            hewan2.jenismakanan("Rumput");
            hewan2.typehewan("Karnivora");
            hewan2.infoHewan();
    }
    
}
