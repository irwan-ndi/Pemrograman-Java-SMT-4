# 6.2. PARAMETERIZED CONSTRUCTOR
- Parameterized constructor sebenarnya merupakan sebuah method, 
- yang mana method bisa memiliki beberapa parameter atau bahkan tidak memiliki parameter (default constructor). 
- Constructor bisa memiliki beberapa parameter sebagai penentu nilai awal dari sebuah object. 
- Seperti layaknya method, parameter di dalam constructor juga harus memiliki tipe data tertentu. 
- Tipe data disini bisa berupa 
  - tipe data reference ataupun 
  - tipe data primitive. 
- Program 3 berikut ini adalah contoh parameterized constructor.
- __*Program 3. Parameterized Constructor*__
  ```java
  public class ParamConstructor{
    String nama, nim;
    int semester;
    
    public ParamConstructor(String nama, int semester,
                        String nim) {
        this.nama = nama;
        this.semester = semester;
        this.nim = nim;
    }
    
    public void info() {
        System.out.println("Nama : " + nama + "\nNim : "
                  + nim +"\nSemester : " + semester);
    }
  }
  ```
  - Program 3 terdapat constructor dengan tiga parameter yaitu : nama, semester dan nim dengan tipe data tertentu. Ketika membuat object baru dari kelas tersebut, maka kita harus mengisikan ketiga parameter tersebut pada setiap object yang dibuat. 
- Untuk melihat hasilnya dapat dilihat melalui Program 4.
  - __*Program 4. Mengakses parameterized constructor*__
    ```java
    public class ConstructorAccess {
      public static void main(String[] args) {
          ParamConstructor pc = new
                ParamConstructor("Luffy", 3, "L2001500xy");
          pc.info();
      }
    }
    ```
  - Pada Program 4 baris ke-3, terlihat jelas bahwa ketika kita membuat object baru kita diwajibkan mengisikan nilai dari masing-masing parameter sesuai dengan tipe datanya masing-masing, 
  - dimana nilai dari parameter inilah yang kita sebut sebagai isi dari object.
- ## 6.2.1. Latihan 2
    1. - Buatlah class Buku dengan variabel String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe dan double hargaJual.
       - Selanjutnya buatlah minimal tiga constructor dengan parameter yang berbeda, serta sebuah method untuk menampilkan informasi buku tersebut!
    2. Buatlah 10 object buku dengan fungsi main() yang dapat menampilkan nilai dari
semua parameter Buku tersebut.
