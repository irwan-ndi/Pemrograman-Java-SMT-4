/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import Utama.Doraemon;

/**
 *
 * @author Irwand
 */
public class DoraemonAccess extends Doraemon{
    public static void main(String[] args) {
            DoraemonAccess dora = new DoraemonAccess();
        dora.setWarna("Biru");
        dora.getWarna();
        dora.setKumis(6);
        dora.getKumis();
    }
}

