# CLASS MEMBER : VARIABEL DAN METHOD
* dlm OOP, setiap object memiliki properties dan behaviour
  * (perilaku yang menunjukkan karakter dari object tersebut)
* Setiap object juga mampu berkomunikasi satu dgn yg lain melalui sebuah _method_
  * Dengan cara mengirimkan pesan tertentu
  * Setiap pesan yg dikirim oleh suatu object akan diterima dan dikenali object lain jika pesan tsb memiliki tipe data yg dikenali object lain

## 1. VARIABEL/FIELD
* merupakan _**member dari class**_
  * dimana setiap variabel harus memiliki tipe data tertentu
  * Ketika kita membuat suatu variabel maka akan ada memori komputer yang disediakan untuk menyimpan variabel tersebut.
  * Tipe data di pemrograman java berupa
    * tipe data primitif
      * tipe data ini sudah didefinisikan oleh bahasa pemrograman dengan kata kunci (keyword) khusus
    * tipe data reference / tipe data object
      * merupakan tipe data yang merujuk pada suatu class object 
      * Tipe data primitif diperlihatkan pada Tabel 3.1
        * Penulisan tipe data pada variabel harus sesuai dengan syntax pemrograman java, seperti contoh berikut ini.
        * ![Tipe data primitif](https://github.com/irwandirefraugati/Pemrograman-Java-SMT-4/blob/main/Pertemuan%2004%20-%20Variable%20dan%20Metode/images/gambar1.jpg)
        * Ada beberapa jenis variabel yang biasa digunakan dalam OOP yaitu : 
          - local variabel, 
          - instance variabel, dan 
          - class/static variabel
          - (Ketiga jenis variabel tersebut memiliki karakteristik yang berbeda-beda)

### 1.1. LOCAL VARIABLE
* Local variable / Variabel lokal merupakan variabel yang dideklarasikan di dalam sebuah method, konstruktor ataupun dalam suatu blok program.
* Variabel jenis ini :
  * akan diciptakan ketika method dijalankan dan 
  * akan dihapus dari memori komputer ketika method tersebut dihentikan.
* Sehingga lokal variabel **hanya bisa digunakan oleh method yang mendeklarasikannya** dan blok atau fungsi lain tidak bisa menggunakan variabel lokal dari method lain.
* Hal yg perlu diperhatikan :
  * lokal variabel tidak memiliki nilai default
  * sehingga setiap variabel harus dideklarasikan nilai awalnya
* `Program 1. Penerapan variabel lokal`
```java
public class LocalVariable{
     public void hitungUsia() {
          int usia = 0; // local variable
          int tahunSekarang = 2019;
          int tahunLahir = 1993;
          
          usia = tahunSekarang - tahunLahir;
          
          System.out.println("Usia saya : " + usia);
  }
}
```
#### LATIHAN 1
1. Buatlah method baru untuk menghitung berat badan dengan nama `void beratBadan()`, di dalam method tersebut buatlah variabel lokal `beratLahir`. Isikan nilai awal pada berat lahir kemudian hitunglah berat badan dengan rumus `beratBadan = beratLahir + (usia/2)`
2. Bisakah nilai dari variabel usia dipanggil dari method `void beratBadan()`? berilah alasannya!
### 1.2. INSTANCE VARIABLE / VARIABEL GLOBAL
* merupakan variabel milik dari suatu class dan berada diluar blok atau method tertentu
* Variabel jenis ini bisa diakses dari semua method yang menjadi member dari class,
* sehingga semua method bisa memanipulasi nilai dari variabel global tersebut.
* Berbeda dengan variabel lokal, variabel global bisa memiliki akses modifier.
* `Program 2. Penerapan variabel global`
```java
public class InstanceVariable{
  int nilai; // instance variable
  
  void firstMethod() {
       // detail
  }
  
  void secondMethod() {
       // detail
  }
}
```
#### LATIHAN 2
1. Modifikasi `class LocalVariable` pada Program 1., dengan menambahkan satu variabel global untuk menampung nilai dari usia.
2. Gunakan nilai usia untuk menyelesaikan permasalahan pada method menghitung berat badan yang ada di Latihan 1.
3. Analisa hasilnya dan bandingkan dengan hasil percobaan sebelumnya!
### 1.1. STATIC VARIABLE
- Variabel statis merupakan variabel yang disimpan di dalam memori statis dan
- __hanya memiliki satu nilai__ di mana nilai tersebut akan dipakai oleh semua object
yang dibuat tanpa ada batasan jumlah object.
- biasanya digunakan untuk membuat nilai konstanta.
- Variabel statis juga bisa diakses oleh semua method yang ada pada suatu class
  - dengan cara memanggil nama dari class dan variabelnya seperti `ClassName.VariableName`.
> Tulis dan jalankan kode Program 3 di bawah ini:
- `Program 3. Penerapan variabel statis`
```java
public class StaticVariable{
  public static char akreditasi;
  public static final String jurusan = "Informatika";

  void firstMethod() {
    System.out.println(jurusan);
  }

  void secondMathod() {
    System.out.println("Akreditasi : " + akreditasi );
  }
}
```
- Variabel statis tidak bisa dijadikan sebagai variabel lokal.
- Sehingga untuk membuatnya, static modifier harus dituliskan pada variable global. 
- Selain itu, untuk mengakses variabel statis kita tidak perlu membuat object dari class yang memiliki variabel statis.
- `Program 4. Contoh pengaksesan variabel statis`
```java
public class StaticVariableAccess{
   public static void main(String[] args) {
        StaticVariable.akreditasi = 'B';
        StaticVariable sv = new StaticVariable();
        sv.firstMethod();
        sv.secondMathod();
   }
}
```
- pada baris ke 3 adalah cara mengakses variabel akreditasi dari class `StaticVariable` tanpa perlu membuat object dari class tersebut.
## 2. METHOD
- Method merupakan blok kode program yang menggambarkan perilaku atau perintah suatu program.
- Method memiliki tiga kategori, 
  - yang pertama adalah method dengan tipe data tertentu yang memiliki nilai return dan
  - yang kedua adalah method dengan kata kunci void. 
  - Ketiga, method juga bisa memiliki parameter.
    - Parameter di dalam method sifatnya tidak wajib dan itu sangat tergantung pada kegunaan dari method tersebut. 
    - Akan tetapi setiap parameter di dalam method harus memiliki tipe data tertentu 
- Secara umum bentuk sebuah method adalah seperti blok berikut.
```java
TipeMethod NamaMathod (parameter) {
   /* code */
}
```
### 2.1. METHOD NON-VOID
- Method jenis ini adalah method yang harus memiliki type data pada body method. 
- Dengan demikian maka Method harus memiliki nilai `return` dimana nilai `return` akan digunakan oleh method lain. 
- Nilai `return` yang dihasilkan oleh method ini **memiliki tipe data yang sama** dengan tipe data yang dituliskan sebelum nama method.
- Contoh :
```java
public String nama() {
   return nama;
}
public double nilaiMax() {
   return 100;
}
```
- Dari contoh di atas terlihat bahwa nilai `return` yang dihasilkan oleh method nama akan bertipe data `String` dan method nilai akan menghasilkan nilai
`return` dengan tipe data `double`.
> Tulis ulang kode Program 5. di bawah ini!
`Program 5. Metode non-void`
```java
   public class NonVoidMethod{
     public String getNama() {
          return nama;
     }
     public String getNIM() {
          return nim;
     }
}
```
- Cobalah untuk memodifikasi kode Program 5, dengan menambahkan dua variabel `nama` dan `nim`, kemudian buatlah fungsi `main()` yang bisa menampilkan nama dan nim Saudara. 
- Tunjukkan hasilnya kepada Asisten Praktikum / Dosen Pengampu.
### 2.2. PARAMETER METHOD
- Parameter pada method merupakan sebuah variabel lokal yang hanya bisa diakses oleh method tersebut. 
- Sebuah method boleh memiliki parameter ataupun tidak 
- bahkan bisa memiliki lebih dari satu parameter, tergantung dari kegunaan method yang kita buat.
- Karena parameter merupakan variabel lokal maka setiap parameter yang dituliskan dalam method **harus memiliki tipe data tertentu**.
- `Program 6. Parameter pada method`
```java
public class MethodParameter {
  String nama;
  public String setNama (String nama) {
     return this.nama = nama;
  }
 }
```
- Berdasarkan Program 6 di atas, terlihat bahwa baris ke-2 merupakan sebuah variabel global yang bertipe data `String`, kemudian pada baris ke-3 sampai 4 merupakan sebuah blok method.
- Di dalam method tersebut terdapat parameter yang bertipe `String`. 
- Ketika kita akan menggunakan atau mengirimkan nilai dari suatu parameter ke parameter lain, maka parameter tersebut harus memiliki tipe data yang sama. 
- Baris ke-4 pada kode di atas akan mengembalikan nilai dari `beriNama` dan kemudian akan disimpan ke dalam variabel `nama`. 
> Tambahkan kode berikut ini kedalam class `MethodParameter` untuk melihat proses kerja dari method `setNama()`.
- `Program 7. Method main() pada class MethodParameter`
```java
public static void main (String[] args) {
      MethodParameter mp = new MethodParameter();
      mp.setNama("Luffy");
      System.out.println(mp.nama);
}
```
#### LATIHAN 3
- Lengkapilah kode Program 8 di bawah ini dengan menambahkan method yang memiliki parameter kemudian tampilkan hasilnya! 
- Buatlah minimal 5 Object pegawai dengan nama, nim dan gaji yang berbeda-beda!
- `Program 8. Latihan membuat parameter pada method`
```java
   public class Pegawai{
      String nama;
      int nip;
      double gaji;
}
```
### 2.3. METHOD VOID
- Method void merupakan method yang tidak menghasilkan nilai kembalian atau **return value**.
- Method dengan tipe void juga **bisa memiliki parameter ataupun tidak**, tergantung dari tujuan penggunaannya. 
> Tuliskan kode di bawah ini dan amati perbedaannya dengan method non-void.
- `Program 9. Method void`
```java
public class VoidMethod{
   int hour, minute, second;
   
   public void duration(int hour,int minute, int
                    second) {

      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   
   public void info() {
      System.out.println("Total Waktu \n" +
           hour + " jam " + minute +
           " menit " + second + " detik");
   }
   
   public static void main (String[] args) {
      VoidMethod vm = new VoidMethod();
      vm.duration(1, 30, 15);
      vm.info();
   }
}
```
## PEKERJAAN RUMAH
`Program 10. Tugas implementasi method`
```java
public class Nilai{
   int nilaiUTS;
   int nilaiUAS;
   int nilaiTugas;
}
```
1. Lengkapilah kode pada Program 10 di atas dengan menambahkan method void dan method return, yang mengembalikan nilai dari setiap parameter method
void.
2. Ubahlah tipe data dari int ke double dan tambahkan satu variabel `double nilaiTotal`, kemudian hitung `nilaiTotal` dengan rumus berikut :
   **nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas)/3**
