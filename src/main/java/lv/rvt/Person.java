package lv.rvt;
//name, age, weight, height, address
public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private String address;

    public Person(String name, int age, int weight, int height, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name  + " " + this.age + " " + this.weight + " " + this.height + " " + this.address;
    }
}
