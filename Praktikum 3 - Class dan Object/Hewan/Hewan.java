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
public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String type;

void beriNama(String namaHewan){
	nama = namaHewan;
}

void beriJumlahKaki(int kakiHewan){
	kaki = kakiHewan;
}

void jenismakanan(String makananHewan){
	makanan = makananHewan;
}

void typehewan(String typeHewan){
	type = typeHewan;
}

void infoHewan(){
   System.out.println(
        "Nama Hewan  : " + nama + "\n" +
	"Jumlah Kaki : " + kaki + "\n" +
	"Makanan     : " + makanan + "\n" +
	"Type Hewan  : " + type );
   System.out.println("\n");
                
    }
}
