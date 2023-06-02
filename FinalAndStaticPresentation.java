package TNSIndia;

final class A{
    static int a=55;
    static void sayHello(){
        System.out.println("Hello");
    }
}
//class B extends A{ //Error
//
//}
public class FinalAndStaticPresentation {
    void nonStatic(){
        A.sayHello();
    }
    static void sayHi(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        System.out.println(A.a);
        sayHi();
        A.sayHello();
    }
}
