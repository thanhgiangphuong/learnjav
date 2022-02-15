package QuanLyTiemBanhMy;

public class Main {
    // main class is needed for every program
    public static void main(String[] args) {
        // create a person is alex
        Person alex = new Person();
        // call setter from class Person and set name set age for alex
        alex.setName("Alex");
        alex.setAge(20);

        // create a flour is flourBake
        Flour flourBake = new Flour();
        // call setter from class Flour and set name set size for flourBake
        flourBake.setName("Baking Powder");
        flourBake.setSize(10);
        alex.setFlour(flourBake);
        // create another flour is flourBake2
        Flour flourBake2 = new Flour();
        flourBake2.setName("Baking Soda");
        flourBake2.setSize(5);
        //call method to run
        alex.makeBakery(flourBake);
        alex.sellFlour(flourBake2);

        // main
    }
}
