package ThisKeyword;

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

public class Test {
    public static void main(String[] args) {
        new A().show().display();
    }
}