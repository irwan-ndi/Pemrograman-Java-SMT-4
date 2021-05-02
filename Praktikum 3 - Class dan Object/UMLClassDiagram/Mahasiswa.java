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
public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
     
    void tampilkanNama(String namaMahasiswa) {
        nama = namaMahasiswa;
    }
    void tampilkanNIM(String NIMMahasiswa) {
        nim = NIMMahasiswa;
    }

    void tampilkanAlamat(String alamatMahasiswa) {
        alamat = alamatMahasiswa;
    }
    
    void tampilkanSemester(int SmtMahasiswa) {
        semester = SmtMahasiswa;
    }
    
    
    void infoMahasiswa() {
        System.out.println(
            "Nama Mahasiswa     : " + nama + "\n" +
            "NIK Mahasiswa      : " + nim + "\n" +
            "Alamat Mahasiswa   : " + alamat + "\n" +
            "Semester Mahasiswa : " + semester + "\n");
    }   
    
}
