/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utama;

/**
 *
 * @author Irwand
 */
public class Doraemon {
    
    private String warna;
    private int kumis;
    
    protected String setWarna (String newWarna){
        return this.warna = newWarna;
    }
    
    public void getWarna(){
        System.out.println("warna doraemon "+warna);
    }
    
    protected int setKumis(int newKumis){
        return this.kumis = newKumis;
    }
    
    public void getKumis(){
        System.out.println("jumlah kumis doraemon "+kumis);
    }
    
}

