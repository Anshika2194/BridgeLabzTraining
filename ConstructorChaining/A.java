package ConstructorChaining;

public class A {
  A(){
    System.out.println("Default constructor");
  }
  A(int x){
    System.out.println("Parameterized constructor : "+x);
  }
  
}
class B extends A{
  B(){
    this(20);
    System.out.println("B default");
  }
  B(int x){
    super(x);
    System.out.println("B parameterized"+x);
  }
  public static void main(String[] args) {
    new B();
  }
}