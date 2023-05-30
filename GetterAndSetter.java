package TNSIndia;
class Student{
    public int id;
    public String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Student s=new Student();
        s.setId(1);
        s.setName("Nirmeet");
        System.out.println("ID is:"+s.getId());
        System.out.println("Name is:"+s.getName());
    }
}
