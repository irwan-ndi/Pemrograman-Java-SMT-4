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
public class RunPegawai extends Pegawai{
    public static void main(String[] args) {
            RunPegawai pemilik = new RunPegawai();
        pemilik.setNama("Paijo");
        pemilik.getNama();
        pemilik.setNIK("1234567890");
        pemilik.getNIK();
    }
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
package Utama;

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
public class RunPegawai extends Pegawai{
    public static void main(String[] args) {
            RunPegawai pemilik1 = new RunPegawai();
        pemilik1.setNama("Paijo");
        pemilik1.getNama();
        pemilik1.setNIK("1234567890");
        pemilik1.getNIK();
        
            RunPegawai pemilik2 = new RunPegawai();
        pemilik2.setNama("Parto");
        pemilik2.getNama();
        pemilik2.setNIK("0987654321");
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
