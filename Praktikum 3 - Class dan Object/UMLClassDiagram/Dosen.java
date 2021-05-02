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
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahir;
     
    void tampilkanNama(String namaDosen) {
        nama = namaDosen;
    }
    void tampilkanNIK(int NIKDosen) {
        nik = NIKDosen;
    }

    void tampilkanPendidikan(String pendidikanDosen) {
        pendidikan = pendidikanDosen;
    }
    
    void tampilkanTglLahir(String tglLahirDosen) {
        tglLahir = tglLahirDosen;
    }
    
    
    void infoDosen() {
        System.out.println(
            "Nama Dosen          : " + nama + "\n" +
            "NIK Dosen           : " + nik + "\n" +
            "Pendidikan Dosen    : " + pendidikan + "\n" +
            "Tanggal Lahir Dosen : " + tglLahir + "\n");
    }   
    
}
