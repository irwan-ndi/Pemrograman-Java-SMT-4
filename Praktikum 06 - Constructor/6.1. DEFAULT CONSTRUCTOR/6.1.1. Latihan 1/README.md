# 6.1.1. Latihan 1
- Buatlah sebuah class yang bersi variabel
  - nama, 
  - nim dan 
  - alamat 
  - serta sebuah *constructor default* yang dapat menampilkan 
     - nama, 
     - nim dan 
     - alamat Saudara. 
- Selanjutnya buatlah kelas baru dengan fungsi ``main()`` di dalamnya untuk menampilkan hasilnya.
## Jawab
### Data Singkat
DataSingkat.java
```java
public class DataSingkat {
    String nama, nim, alamat;
    
    public DataSingkat(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }
    
    public void info() {
        System.out.println("Nama : " + nama + "\nNIM : "
                  + nim +"\nAlamat : " + alamat);
    }
  }
```
### Data Singkat Access
DataSingkatAccess.java
```java
public class DataSingkatAccess {
    public static void main(String[] args) {
        DataSingkat pc = new
              DataSingkat ("Irwandi Refraugati", "1913010113", "Bayan, Kadipiro, Solo");
        pc.info();
    }
  }
```
Run
```
Nama : Irwandi Refraugati     
NIM : 1913010113
Alamat : Bayan, Kadipiro, Solo
```
