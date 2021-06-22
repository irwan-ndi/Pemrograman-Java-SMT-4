# 6.1. DEFAULT CONSTRUCTOR
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
  - Hasil
    ```
    Default Constructor
    ```
## 6.1.1. Latihan 1
- Buatlah sebuah class yang bersi 
  - variabel nama, 
  - nim dan 
  - alamat 
  - serta sebuah *constructor default* yang dapat menampilkan 
     - nama, 
     - nim dan 
     - alamat Saudara. 
- Selanjutnya buatlah kelas baru dengan fungsi ``main()`` di dalamnya untuk menampilkan hasilnya.
