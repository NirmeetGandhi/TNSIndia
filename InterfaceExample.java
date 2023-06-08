package TNSIndia;

interface Camera{
    int a=45;
    default void recordVideo(){
        System.out.println("Recording in 4K...");
        greet();
    }
    private void greet()
    {
        System.out.println("Good Morning...");

    }
    abstract void takeSnap();
    abstract void record5K();
    }
    interface Wifi{

    }
interface GPS extends Camera,Wifi{
    abstract void giveLocation();
}
class SmartPhone implements Camera,GPS{
//    @Override
//    public void recordVideo(){
//        System.out.println("Taking snap and recording...");
//    }

    @Override
    public void takeSnap() {
        System.out.println("Snap taken...");
    }

    @Override
    public void record5K() {
        System.out.println("Recording in 5K...");
    }

    @Override
    public void giveLocation() {
        System.out.println("The coordinates are 1.1.1.1...");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone obj=new SmartPhone();
        obj.giveLocation();
        obj.record5K();
        obj.recordVideo();
        obj.takeSnap();
//        Camera.a=55; //will give an error

    }
}
