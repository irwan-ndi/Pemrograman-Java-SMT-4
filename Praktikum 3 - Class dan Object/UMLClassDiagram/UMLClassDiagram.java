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
public class UMLCLassDiagram {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.tampilkanNama("Ikhsan Akbar");
        dosen1.tampilkanNIK(123456);
        dosen1.tampilkanPendidikan("Teknik Perteknikan");
        dosen1.tampilkanTglLahir("05-05-1986");
        dosen1.infoDosen();
        
        Karyawan karyawan1 = new Karyawan();
        karyawan1.tampilkanNama("Ilham Aziz");
        karyawan1.tampilkanAlamat("Kadipiro, Solo");
        karyawan1.tampilkanJabatan("Konsumsi");
        karyawan1.tampilkanGaji(5000000);
        karyawan1.infoKaryawan();
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.tampilkanNama("Irwandi Refraugati");
        mahasiswa1.tampilkanNIM("1913010113");
        mahasiswa1.tampilkanAlamat("Bayan, Kadipiro, Solo");
        mahasiswa1.tampilkanSemester(4);
        mahasiswa1.infoMahasiswa();
        
    }
    
}
