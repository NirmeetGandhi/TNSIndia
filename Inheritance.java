package TNSIndia;
class Parent{
    int id;
    String name;

    Parent(){
        System.out.println("I am Parent class constructor");
    }
}
class Child extends Parent{
    String address;
    void display(){
        System.out.println("Name "+name);
    }
    Child(){
        System.out.println("I am child class constructor");
    }
}
class ChildOfChild extends Child{
    void showInfo(){
        System.out.println("Address iss "+address);
    }
    ChildOfChild(){
        System.out.println("I am child of child constructor");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        ChildOfChild c=new ChildOfChild();

    }
}
