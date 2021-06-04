# Isi Project `uts_1913010113`
`Package1` dan `Package2` merupakan **Package**
## Soal (UML)
```java
Pegawai
-------------------------------------
-Nama : String
--------------
-NIK : String
-------------------------------------
#setNama (newNama:String) : String
+getNama() : void
#setNIK(newNIK: String) : String
+getNIK(): void
```
### Keterangan singkat
- gambare = UML
  - Judol = class
    - `Pegawai`
  - Variabel
    - `-Nama : String`
    - `-NIK : String`
  - Metode
    ```java
    #setNama (newNama: String) : String
    +getNama() : void
    #setNIK(newNIK: String) : String
    +getNIK(): void
    ```
    - sing dingarani method wi jane sing `void` kuwi,
    - tapi rumus penjabarannya panjang gitu  
  - Objek = String
  - Modifier (Pengaksesan)
    - `#` >> protected
    - `+` >> public
    - `-` >> private
## Jawaban 1
### Package1
#### Pegawai.java
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;         // kita membuat package 1, sebagai package utama
                          // di dalam package 1 kita membuat class bernama Pegawai, sesuai ketentuan
/**
 *
 * @author Irwand
 */
public class Pegawai {    // method class di set ke public
    
    private String nama;  // modifier (set private), objek, variabel
    private String NIK;
    
    protected String setNama (String newNama){      // method, modifier  (method di modifier kita set ke protected)
        return this.nama = newNama;
    }
    
    public void getNama(){
        System.out.println("nama Pegawai "+nama);
    }
    
    protected String setNIK(String newNIK){
        return this.NIK = newNIK;
    }
    
    public void getNIK(){
        System.out.println("NIK Pegawai "+NIK);
    }
    
}
```
### Package2
#### RunPegawai.java
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;                                     // kita membuat package 2, sebagai package utama
                                                      // di dalam package 2, kita membuat class lagi bernama RunPegawai, sesuai ketentuan
import Package1.Pegawai;                              // kita import dari package 2 ke package 1 di class Pegawai

/**
 *
 * @author Irwand
 */
public class RunPegawai extends Pegawai{              // method, class package 2, class package 1  (metode harus dijabarkan oi)
    public static void main(String[] args) {          // method di set publik
            RunPegawai pemilik = new RunPegawai();    // kita buat persamaan objek dari RunPegawai menjadi pemilik ,
        pemilik.setNama("Paijo");                     // jika kita sewaktu-waktu ingin menambahkan objek kita 
        pemilik.getNama();                            // jadi tinggal menambahkan angka saja di belakang pemiliknya saja
        pemilik.setNIK("1234567890");                 // kemudian kita jalankan class RunPegawai, dan hasilnya sebagai berikut
        pemilik.getNIK();                             // karena methodnya kita set public, maka UML 2 di package 2
    }                                                 //  dapat terhubung dengan UML 1 di package 1
}


```
## Hasil 1 :
```
run:
nama Pegawai Paijo
NIK Pegawai 1234567890
BUILD SUCCESSFUL (total time: 0 seconds)

```
## Jawaban 2
### Perintah Tambahan :
- Buatlah 2 buah objek dari class tersebut tersebut!
  - Objek = macam-macam orang
### Package1
#### Pegawai.java
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author Irwand
 */
public class Pegawai {
    
    private String nama;
    private String NIK;
    
    protected String setNama (String newNama){
        return this.nama = newNama;
    }
    
    public void getNama(){
        System.out.println("nama Pegawai "+nama);
    }
    
    protected String setNIK(String newNIK){
        return this.NIK = newNIK;
    }
    
    public void getNIK(){
        System.out.println("NIK Pegawai "+NIK);
    }
    
}

```
### Package2
#### RunPegawai.java
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import Package1.Pegawai;

/**
 *
 * @author Irwand
 */
public class RunPegawai extends Pegawai{                // langsung saja kita menuju ke class RunPegawai di package 2
    public static void main(String[] args) {
            RunPegawai pemilik1 = new RunPegawai();     // kita ganti objek RunPegawai pemilik menjadi pemilik1
        pemilik1.setNama("Paijo");                      // kita jadi tinggal menambahkan angka saja di belakang pemiliknya saja
        pemilik1.getNama();
        pemilik1.setNIK("1234567890");
        pemilik1.getNIK();
        
            RunPegawai pemilik2 = new RunPegawai();     // karena di soal meminta 2 penambahan objek,
        pemilik2.setNama("Parto");                      // jadi kita tinggal kopikan objek pertama dan menambah 2 objek
        pemilik2.getNama();                             // jadi nanti masing2 objek bernama pemilik2 dan pemilik3
        pemilik2.setNIK("0987654321");                  // dan hasilnya sebagai berikut
        pemilik2.getNIK();
        
            RunPegawai pemilik3 = new RunPegawai();
        pemilik3.setNama("Temon");
        pemilik3.getNama();
        pemilik3.setNIK("999999999");
        pemilik3.getNIK();
    }
}

```
## Hasil 2 :
```
run:
nama Pegawai Paijo
NIK Pegawai 1234567890
nama Pegawai Parto
NIK Pegawai 0987654321
nama Pegawai Temon
NIK Pegawai 999999999
BUILD SUCCESSFUL (total time: 0 seconds)

```
