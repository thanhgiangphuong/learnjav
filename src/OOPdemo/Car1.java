package OOPdemo;

public class Car1 {
    int modelYear;
    String modelName;

    // Create a class constructor with many parameters (int Year, String Name)
    public Car1(int Year, String Name) {
        this.modelYear = Year;
        this.modelName = Name;
    }

    public static void main(String[] args) {
        // call constructor and transfer parameters
        Car1 mycar = new Car1(1989, "BMW");
        System.out.println(mycar.modelYear + " " + mycar.modelName);

        // we can create many objects in a class
        Car1 mycar1 = new Car1(1979, "KIA");
        System.out.println(mycar1.modelYear + " " + mycar1.modelName);
    }
}
