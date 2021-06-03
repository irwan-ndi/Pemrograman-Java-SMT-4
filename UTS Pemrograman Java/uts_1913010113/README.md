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
  - Modifier (Pengaksesan)
    - `#` >> protected
    - `+` >> public
    - `-` >> private
## Jawab
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
    
    public void getNama){
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
package access;

import Utama.Pegawai;

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

## Hasil :
```
run:

```
