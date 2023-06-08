package TNSIndia;

import java.util.concurrent.locks.ReadWriteLock;

interface ShapeInterface{

    abstract void getArea();
    static void test(){
        System.out.println("I am the static method");
    }
}
class Circle implements ShapeInterface{
    double r;
    Circle(double r){
        this.r=r;
    }
    public void getArea(){
        System.out.println("The area of Circle is "+Math.PI*r*r);
    }
}
class Rectangle implements ShapeInterface{
    double w;
    double l;
    Rectangle(double w,double l){
        this.w=w;
        this.l=l;
    }
    @Override
    public void getArea() {
        System.out.println("The area of Rectangle is "+w*l);
    }
}
class Triangle implements ShapeInterface{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public void getArea() {
        System.out.println("The area of Triangle is "+ (height*base)/2);
    }
}
public class Shape {
    public static void main(String[] args) {
        ShapeInterface t=new Triangle(1.1,2);
        t.getArea();
        ShapeInterface c=new Circle(3);
        c.getArea();
        ShapeInterface r=new Rectangle(1,2);
        r.getArea();
    }
}
