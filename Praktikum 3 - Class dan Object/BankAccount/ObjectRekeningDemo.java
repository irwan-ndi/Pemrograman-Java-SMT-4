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
public class ObjectRekeningDemo {
    public static void main(String[] args) {
        ObjectRekening rekening1 = new ObjectRekening();
        rekening1.tampilkanNama("Irwandi Refraugati");
        rekening1.tampilkanNomorRekening(12345678);
        rekening1.cek_Saldo(16000000);
        rekening1.infoObjectRekening();
    }
}
