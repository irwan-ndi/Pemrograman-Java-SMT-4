package Roti;               // ini nama Paketnya
public class Roti {
    String nama;
    String warna;
    String rasa;
    int berat;
    double harga;
     
    void beriNama(String namaRoti) {
        nama = namaRoti;
    }
    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }
    
    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }
    
    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }
    
    void infoRoti() {
        System.out.println(
            "Nama Roti : " + nama + "\n" +
            "Warna Roti : " + warna + "\n" +
            "Rasa Roti : " + rasa + "\n" +
            "Berat Roti : " + berat + " gr\n" +
            "Harga Roti : Rp. " + harga + "\n");
    }
}
