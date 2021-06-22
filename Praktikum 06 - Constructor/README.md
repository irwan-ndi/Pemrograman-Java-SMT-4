# CONSTRUCTOR
- metode yg dpt digunakan utk memberikan nilai awal saat object diciptakan.
- metode ini akan dipanggil scr otomatis oleh java ketika new dipakai untuk menciptakan object dr suatu kelas
- Karakteristik constructor :
  - nama constructor == nama kelas
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
