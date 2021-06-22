public class Buku {
    // Data member
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    Double hargaJual;
    
    // constructor, yg dikurung merupakan parameter
    public Buku(String namaPengarang, String judulBuku,
                int tahunTerbit, int cetakanKe,
                double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    // method
    public void info() {
        System.out.println("Judul Buku : " + judulBuku + "\nNama Pengarang : "
                            + namaPengarang +"\nTahun Terbit : " + tahunTerbit 
                            +"\nCetakan ke : " + cetakanKe +"\nHarga Jual : " 
                            + hargaJual +"\n---------");
    }
  }