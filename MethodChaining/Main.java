package MethodChaining;

class A {
    A show() {
        System.out.println("Show");
        return this;
    }

    A display() {
        System.out.println("Display");
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
      A obj=new A();
        obj.show().display();
    }
  
}
