package MethodChaining;

class Student {
    String name;
    int age;

    Student setName(String name) {
        this.name = name;
        return this;
    }

    Student setAge(int age) {
        this.age = age;
        return this;
    }

    void display() {
        System.out.println(name + " " + age);
    }
  
}
public class Test {
  public static void main(String[] args) {
    new Student()
            .setName("Anshika")
            .setAge(20)
            .display();
  }
}
