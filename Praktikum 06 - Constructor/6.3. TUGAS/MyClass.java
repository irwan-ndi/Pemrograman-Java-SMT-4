public class MyClass {
    
    int num1;
    double num2;
    
    //Default Constructor
    public MyClass()
    {
        System.out.println("Default Constructor Called");
        num1=1;
        num2=1.5;
    }
    //Parameterized Constructor 1
    public MyClass(int x) {   
        System.out.println("Parameterized Constructor 1 Called");
        num1=x;
    }
    //Parameterized Constructor 2
    public MyClass(int x, double z) { 
        System.out.println("Parameterized Constructor 2 Called");
        num1=x;
        num2=z;
    }
    void displayData()
    {
        System.out.println("Num1: "+num1+"\nNum2: "+num2);
    }
}