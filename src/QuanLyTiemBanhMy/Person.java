package QuanLyTiemBanhMy;

public class Person {
    private String name;
    private int age;
    private Flour flour;

    public void makeBakery(Flour flour){
        System.out.println("Alex is making bakery " + flour.getName());
    }

    public void sellFlour (Flour flour1){
        System.out.println("Alex is selling flour " + flour1.getName());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }
}
