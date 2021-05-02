/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMLClassDiagram;

/**
 *
 * @author Irwand
 */
public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;
     
    void tampilkanNama(String namaKaryawan) {
        nama = namaKaryawan;
    }
    
    void tampilkanAlamat(String alamatKaryawan) {
        alamat = alamatKaryawan;
    }
    
    void tampilkanJabatan(String jabatanKaryawan) {
        jabatan = jabatanKaryawan;
    }
    
    void tampilkanGaji(double gajiKaryawan) {
        gaji = gajiKaryawan;
    }
    
    void infoKaryawan() {
        System.out.println(
            "Nama Karyawan    : " + nama + "\n" +
            "Alamat Karyawan  : " + alamat + "\n" +
            "Jabatan Karyawan : " + jabatan + "\n" +
            "Gaji Karyawan    : " + gaji + "\n");
    }    
}
