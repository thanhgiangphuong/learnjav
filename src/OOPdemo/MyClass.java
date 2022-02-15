package OOPdemo;

public class MyClass {
    int x = 5;
    // constructor has parameter (int y)
    public MyClass(int y) {
        x = y;
    }

    public static void main(String[] args) {
        // call constructor and transfer the value for parameters ( y = 5)
        MyClass myObject = new MyClass(7);
        //
        System.out.println(myObject.x);
    }
}
