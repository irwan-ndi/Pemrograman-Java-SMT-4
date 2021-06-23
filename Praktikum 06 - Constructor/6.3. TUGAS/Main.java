public class Main {
    public static void main(String[] args) {
        
        MyClass obj1 = new MyClass(); // Default Constructor Called
        obj1.displayData();
        MyClass obj2 = new MyClass(5); // Parameterized Constructor 1 Called
        obj2.displayData();
        MyClass obj3 = new MyClass(5,5.5); // Parameterized Constructor 2 Called
        obj3.displayData();
    }
  }