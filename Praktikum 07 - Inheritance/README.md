# BAB 7 INHERITANCE
- Inheritance (pewarisan) adalah salah satu ciri utama dari PBO dan merupakan fitur yang sangat memudahkan bagi programmer untuk membuat dan mengatur program. 
- Sepertihalnya dalam kehidupan riil, sifat seoran anak secara umum mirip dengan sifat orang tuanya. 
- Demikian juga pada kasus pemrograman. 
- Suatu class yang diturunkan (inherited from) dari induknya (parent class) akan mewarisi semua atau sebagian sifat (variabel dan fungsi) dari class induknya. 
- Dengan inheritance kita tidak perlu membuat (mengimplementasikan) ulang suatu class jika kita sudah memiliki class lain yang serupa. 
- Inheritance dapat digambarkan pada contoh Gambar 7 di bawah ini.

<p align="center">
  <img src="https://github.com/irwandirefraugati/Pemrograman-Java-SMT-4/blob/main/Praktikum%2007%20-%20Inheritance/images/7.jpg">
</p>

- Gambar 7 mengilustrasikan bahwa MountainBike, Roadbike dan TandemBike pas-tilah memiliki banyak kesamaan sifat dengan sepeda pada umumnya, 
- sehingga untuk membuat ketiga jenis sepeda tersebut kita cukup mengambil karakter dari sepeda secara umum semisal semua sepeda pasti memiliki gear, peda, rem, dan lain sebagainya. 
- Oleh karena itu kita hanya perlu menurunkan sifat sepeda (Bicycle) kemudian kita terapkan pada MountainBike, RoadBike dan TandemBike.
  
   Untuk menggunakan inheritance kata kunci yang diperlukan adalah extends. Secara umum sintaks dari inheritance adalah seperti berikut :
```java
class SubClass extends SuperClass{
	/* code */
}
```
- Class SubClass merupakan class turunan dari SuperClass. 
- Oleh karena itu properties yang dimiliki oleh SuperClass seperti variabel dan method akan bisa juga dimiliki oleh SubClass.
## 7.1. TIPE INHERITANCE
Dalam pemrograman berorientasi object inheritance memiliki 3 tipe antara lain
1. **Single inheritance** : Suatu class hanya memiliki satu turunan
2. **Multilevel inheritance** : konsep inheritance yang mengijinkan suatu subclass mempunyai subclass lagi.
3. **Hierarchical inheritance** : Suatu class dapat memiliki lebih dari satu class turunan

<p align="center">
  <img src="https://github.com/irwandirefraugati/Pemrograman-Java-SMT-4/blob/main/Praktikum%2007%20-%20Inheritance/images/7.1.jpg">
</p>

_Gambar 7.1 Tipe inheritance_
### 7.1.1.SINGLE INHERITANCE
- Single inheritance memperbolehkan subclass hanya mempunyai satu superclass. 
- Program 1 berikut ini adalah contoh single inheritance. 
- Program 1 menunjukkan bahwa class Programmer merupakan class turunan dari class Pegawai, 
  - sehingga kita bisa menggunakan variabel dari class `Pegawai` dan menggunakannya ke dalam class `Programmer`. 
- Pada baris ke-6 terlihat bahwa class programmer menggunakan variabel `gajiPokok` dari class `pegawai` dan menjumlahkannya dengan variabel yang ada pada class `programmer`.
```java
public class Pegawai {
      double gajiPokok = 10000000;
}
```
```java
public class Programmer extends Pegawai{
  public static void main(String[] args) {
  double lemburPerjam = 50000;
  double gajiPerBulan;
  Pegawai pegawai = new Pegawai();
    gajiPerBulan = pegawai.gajiPokok + lemburPerjam;
    System.out.println(gajiPerBulan);
  }
}
```
_Program 1. Contoh program single inheritance_
### 7.1.2.HIERARCHICAL INHERITANCE
- Dari Program 1 di atas, kelas Pegawai dapat ditambahkan beberapa class turunan yang lain sehingga class Pegawai nantinya memiliki beberapa class turunan. 
- Inilah yang disebut dengan hierarchical inheritance. 
- Silahkan tulis kode Program 2 berikut ini untuk mempermudah pemahaman.
```java
public class Teknisi extends Pegawai{
  public static void main(String[] args) {
      double lemburPerjam = 40000;
      double gajiPerBulan;
      Pegawai pegawai = new Pegawai();
      gajiPerBulan = pegawai.gajiPokok + lemburPerjam;
      System.out.println(gajiPerBulan);
  }
}
```
_Program 2. Contoh program hierarchical inheritance_

Program 2 menunjukkan bahwa variabel dari class Pegawai bisa dipakai oleh class-class turunannya tanpa perlu kita membuat variabel sendiri di masing-masing class turunannya.
### 7.1.3.MULTILEVEL INHERITANCE
- Multilevel inheritance merupakan model class turunan dimana suatu sub-class memiliki sub-class lain. 
- Sub-class dari sub-class juga memiliki akses ke classinduk yang paling atas. 
- Jika kita ilustrasikan dalam kehidupan nyata seperti seorang cucu yang memiliki orang tua dan kakek, dimana cucu tersebut boleh menggunakan barang milik ayahnya sekaligus barang milik kakeknya. 
- Tulislah Program 3 berikut ini dan jalankan!
```java
public class A {
      public void MessageA() {
            System.out.println("Info dari Class A");
      }
}
```
```java
public class B extends A {
      public void MessageB() {
            System.out.println("Info dari Class B");
      }
}
```
```java
public class C extends B {
      public void MessageC() {
            System.out.println("Info dari Class C");
      }
}
```
_Program 3. Contoh program hierarchical inheritance_

Berdasarkan contoh Program 3 di atas, untuk melihat apakah class turunan yang paling bawah (`class C`) bisa mengakses properti dari class A dan class B maka Program 4 perlu dijalankan.
```java
public class InheritanceTest {
  public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      
      a.MessageA();
      b.MessageB();
      b.MessageA();
      c.MessageC();
      c.MessageB();
      c.MessageA();
  }
}
```

_Program 4. Contoh pengaksesan properties pada multilevel inheritance_

- Program 4 menunjukkan bahwa object dari `class A` hanya bisa
menggunakan method yang ada pada class A sendiri. Tetapi object dari `class
B` bisa menggunakan method dari class A. Begitu juga dengan `class C` dimana
object dari `class C` memiliki akses ke method yang ada pada `class A` dan `B`.
- Dengan demikian dapat diambil kesimpulan bahwa induk class (Super class) tidak
bisa mengakses variabel atau method dari anak class (sub class), tetapi sub-class
memiliki akses pada variabel atau method dari super class selama variabel atau class
tersebut tidak bersifat `private`.
## 7.2. LATIHAN
1. - Buatlah suatu class `Kendaraan`, yang memiliki minimal 3 instance variables
yang memiliki nilai awal. 
   - Setelah itu, buatlah class `Mobil` dan `Pesawat`, 
   - yang
masing-masing merupakan subclass dari `Kendaraan`.
2. Dari tiap subclass, buatlah 1 variable unique 
   - yang memiliki nilai awal, 
   - yang tidak terdapat pada superclass, 
   - dan 1 variable – memiliki nilai awal – memiliki
nama yang sama dengan nama variable yang ada pada superclassnya.
3. Buatlah class dengan main method untuk menampilkan hasil dari kode diatas.
   - Main method harus menampilkan nilai yang tersimpan pada seluruh instance
variable yang terdapat pada subclass dan superclass.
   - _NB: Pada kasus soal nomor 3, variable yang ada di superclass hanya boleh
diakses melalui subclassnya. Mahasiswa tidak diperkenankan mengakses
langsung variable superclass dari object yang dihasilkan dari superclass._
## 7.3. TUGAS
Buatlah kode program berdasarkan Gambar 7.3 di bawah ini, untuk
mengimplementasikan inheritance!

<p align="center">
  <img src="https://github.com/irwandirefraugati/Pemrograman-Java-SMT-4/blob/main/Praktikum%2007%20-%20Inheritance/images/7.3.jpg">
</p>
