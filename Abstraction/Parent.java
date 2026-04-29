package Abstraction;

public abstract class Parent {
    static void hello() {
        System.out.println("hey");
    }

    abstract void career(String name);
    abstract void partner(String name,int age);
}
