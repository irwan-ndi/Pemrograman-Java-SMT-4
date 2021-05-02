/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author Irwand
 */
public class ObjectRekening {
    String nama;
    int no_rekening;
    int saldo;
    
    void tampilkanNama(String namaPemilik) {
        nama = namaPemilik;
    }
    void tampilkanNomorRekening(int NomorRekening) {
        no_rekening = NomorRekening;
    }
    void cek_Saldo(int Saldo) {
        saldo = Saldo;
    }
    void menabung(String namaMahasiswa) {
        // kosong
    }
    void menarik(String namaMahasiswa) {
        // kosong
    }
    void transfer(String namaMahasiswa) {
        // kosong
    }

    void infoObjectRekening() {
        System.out.println(
        "Nama Pemilik   : " + nama + "\n" +
        "Nomor Rekening : " + no_rekening + "\n" +
        "Saldo          : " + saldo + "\n" +
        "Menarik        : " + "(kosong) \n" +
        "Menabung       : " + "(kosong) \n" +
        "Transfer       : " + "(kosong) \n");
    }
}


/*
- [ ] cek_saldo()
- [ ] menabung()
- [ ] menarik()
- [ ] transfer()
*/
