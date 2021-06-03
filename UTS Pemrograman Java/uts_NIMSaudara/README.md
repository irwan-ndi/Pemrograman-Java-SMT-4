# Isi Project `uts_NIMSaudara`
`Utama` dan `access` merupakan **Package**

### Utama
```java
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

```
### access
```java
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

```

## Hasil :
```
run:
warna doraemon Biru
jumlah kumis doraemon 6
BUILD SUCCESSFUL (total time: 0 seconds)
```
