/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irwand
 */
package Roti;                                       // ini nama Paketnya
public class RotiDemo{
    public static void main(String[] args) {
        Roti roti1 = new Roti();
        roti1.beriNama("Roti Tawar");
        roti1.beriWarna("White");
        roti1.beriRasa("Tawar");
        roti1.timbangBerat(30);
        roti1.hargaJual(6000);
        roti1.infoRoti();
        
        Roti roti2 = new Roti();
        roti2.beriNama("Roti Daging");
        roti2.beriWarna("Golden Brown");
        roti2.beriRasa("Ayam");
        roti2.timbangBerat(30);
        roti2.hargaJual(20000);
        roti2.infoRoti();
        
        Roti roti3 = new Roti();
        roti3.beriNama("Roti Selai");
        roti3.beriWarna("Golden Brown");
        roti3.beriRasa("Pandan");
        roti3.timbangBerat(30);
        roti3.hargaJual(5000);
        roti3.infoRoti();
        
        Roti roti4 = new Roti();
        roti4.beriNama("Roti Keju");
        roti4.beriWarna("Golden Brown");
        roti4.beriRasa("Keju");
        roti4.timbangBerat(30);
        roti4.hargaJual(15000);
        roti4.infoRoti();
    }
}
