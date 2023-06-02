package TNSIndia;
class RBI{
    float interest(){
        return 5f;
    }
}
class SBI extends RBI{
    @Override
    float interest() {
        return 7f;
    }
}
class HDFC extends RBI{
    @Override
    float interest() {
        return 10f;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI b=new SBI();
        System.out.println(b.interest());
        HDFC h=new HDFC();
        System.out.println(h.interest());
    }
}
