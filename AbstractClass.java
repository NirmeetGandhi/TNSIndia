package TNSIndia;
abstract class Animal{
    String name;
    int age;
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark Bark...");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow meow...");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
