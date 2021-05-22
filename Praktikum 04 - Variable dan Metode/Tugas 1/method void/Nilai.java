public class Nilai{
   int nilaiUTS, nilaiUAS, nilaiTugas;
  
  public void nilaiTotal(int nilaiUTS + int nilaiUAS +
                         int nilaiTugas) {
  
      this.nilaiUTS   = nilaiUTS;
      this.nilaiUAS   = nilaiUAS;
      this.nilaiTugas = nilaiTugas;
  }
  
  public void info() {
    System.out.println("Nilai Total \n" +
           nilaiUTS + " Nilai UTS " + nilaiUAS +
           " Nilai UAS " + nilaiTugas + " Nilai Tugas");  // je salah
  }
  
  public static void main (String[] args) {
     Nilai n = new Nilai();
     n.nilaiTotal(1, 30, 15);
     n.info();                                            // dadi n njir
  }
}
