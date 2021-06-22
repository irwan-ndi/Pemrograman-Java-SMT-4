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