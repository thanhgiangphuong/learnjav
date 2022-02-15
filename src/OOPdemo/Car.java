package OOPdemo;

public class Car {
    // create class attribute
    int x;

    // Create a class constructor for the class attribute x
    public Car() {
        x = 5;
    }
    static void run(){
        System.out.println("Xe chạy");
    }
    public static void main(String[] args) {
        // create an object of class Car (this will call the constructor)
        Car myObject = new Car();
        // We can get the attribute using the "."
        System.out.println(myObject.x);
        run();
    }
}
