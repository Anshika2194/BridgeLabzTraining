package ConstructorChaining;

public class Student {
  int id;
  String name;
  Student(){
    this(0,"Unknown");
  }
  Student(int id){
    this(id,"Unknown");
  }
  Student(int id, String name){
    this.id = id;
    this.name = name;
  }
  void display(){
    System.out.println("ID: "+id+" Name: "+name);
  }
  public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Anshika");
        s1.display();
        s2.display();
        s3.display();
    }
}
