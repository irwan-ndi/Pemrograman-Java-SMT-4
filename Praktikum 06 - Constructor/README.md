# CONSTRUCTOR
- metode yg dpt digunakan utk memberikan nilai awal saat object diciptakan.
- metode ini akan dipanggil scr otomatis oleh java ketika ``new`` dipakai untuk menciptakan object dr suatu kelas
- Karakteristik constructor :
  - nama constructor = nama kelas
  - tidak memiliki nama kembali/return value
- Tipe constructor :
  - *Default constructor*
  - *Parameterized constructor*
## 6.1. DEFAULT CONSTRUCTOR
- merupakan constructor yg scr otomatis dibuatkan oleh java *compiler*
- shg meskipun kita tdk menuliskan atau membuat constructor scr eksplisit java sudah menyediakannya
- __*Program 1. Default Constructor*__
  ```java
  public class Constructor {
        public Constructor() {
              System.out.println("Default Constructor");
        }
  }
  ```
- Baris kode ke 2-4 pada Program 1 merupakan constructor yang tidak memiliki detail implementasi.
  - Constructor yang seperti ini disebut dengan default constructor
  - kita boleh menuliskannya maupun tidak.
  - Tujuan sebenarnya dari constructor ini adalah untuk memberikan nilai awal pada object seperti 0, NULL, dan sebagainya.
  - Dari contoh Program 1, nilai default dari object yang diciptakan melalui constructor adalah menampilkan output ke layar berisi teks ”Default Constructor”. Program 2 berikut ini dapat digunakan untuk menambah pemahaman tersebut.
  - __*Program 1. Mengakses Default Constructor*__
  - 
    ```java
    public class ConstructorAccess {
          public static void main(String[] args) {
                Constructor cons = new Constructor();
          }
    }
    ```
  - ### 6.1.1. Latihan 1
      Buatlah sebuah class yang bersi variabel nama, nim dan alamat serta sebuah *constructor default* yang dapat menampilkan nama, nim dan alamat Saudara. Selanjutnya buatlah kelas baru dengan fungsi ``main()`` di dalamnya untuk menampilkan hasilnya.
## 6.2. PARAMETERIZED CONSTRUCTOR
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
- ### 6.2.1. Latihan 2
    1. - Buatlah class Buku dengan variabel String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe dan double hargaJual.
       - Selanjutnya buatlah minimal tiga constructor dengan parameter yang berbeda, serta sebuah method untuk menampilkan informasi buku tersebut!
    2. Buatlah 10 object buku dengan fungsi main() yang dapat menampilkan nilai dari
semua parameter Buku tersebut.
## 6.3. TUGAS
1. Buatlah sebuah class yang didalamnya terdapat default constructor dan parameterized constructor!
2. Tambahkan class baru berisi method main() sebagai implementasi dari kelas di atas (No.1)!
