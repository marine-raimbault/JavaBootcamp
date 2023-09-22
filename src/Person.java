public class Person {
    // 🔴 Level 3 topics : Object Oriented Programming (OOP)
    private String name;
    private int age;

    public Person(String name, int age) { // Constructor
        this.name = name;
        this.age = age;
    }

    // toString method
    // copy constructor

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
