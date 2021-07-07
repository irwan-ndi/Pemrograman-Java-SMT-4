# 7.1.1.SINGLE INHERITANCE
  Single inheritance memperbolehkan subclass hanya mempunyai satu superclass. Program 1 berikut ini adalah contoh single inheritance. Program menunjukkan bahwa class Programmer merupakan class turunan dari class Pegawai, sehingga kita bisa menggunakan variabel dari class Pegawai dan menggunakannya ke dalam class Programmer. Pada baris ke-6 terlihat bahwa class programmer menggunakan variabel gajiPokok dari class pegawai dan menjumlahkannya dengan vari-abel yang ada pada class programmer.
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
