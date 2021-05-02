/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kucing;

/**
 *
 * @author Irwand
 */
class Meong {
    int umur;
    String warnabulu;
}
        
public class Kucing {
   public static void main(String[] args) throws Exception {
     Meong meong1 = new Meong();
     
     meong1.umur          = 5;
     meong1.warnabulu     = "Oren";
     
     
     

     
     System.out.println("Umur Kucing       : " + meong1.umur);
     System.out.println("Warna Bulu Kucing : " + meong1.warnabulu + "\n");
     
 
   } 
}
