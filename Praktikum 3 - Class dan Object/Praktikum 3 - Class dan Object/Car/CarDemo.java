/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Irwand
 */
class Car{
    int changeCadence;
    int speedUp;
    int changeGear;
    String printInfo;
}
        
public class CarDemo {
   public static void main(String[] args) throws Exception {
     Car car1 = new Car();
     Car car2 = new Car();
     
     
     car1.changeCadence = 50;
     car1.speedUp       = 20;
     car1.changeGear    = 2;
     car1.printInfo     = "ini mobil 1";
     
     
     
     car2.changeCadence = 30;
     car2.speedUp       = 10;
     car2.changeGear    = 1;
     car2.printInfo     = "ini mobil 2";
     
     System.out.println("changeCadence : " + car1.changeCadence);
     System.out.println("speedUp       : " + car1.speedUp);
     System.out.println("changeGear    : " + car1.changeGear);
     System.out.println("Info          : " + car1.printInfo + "\n");
     
     System.out.println("changeCadence : " + car2.changeCadence);
     System.out.println("speedUp       : " + car2.speedUp);
     System.out.println("changeGear    : " + car2.changeGear);
     System.out.println("Info          : " + car2.printInfo + "\n");
   } 
}
