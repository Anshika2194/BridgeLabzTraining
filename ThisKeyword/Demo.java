package ThisKeyword;


class B {
    void show2(B obj) {
        System.out.println("Method called");
    }

    void display() {
        show2(this);
    }
}
public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}