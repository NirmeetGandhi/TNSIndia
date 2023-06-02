package TNSIndia;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class Employee{
    Employee(){

    }

    String name;
    int yearOfJoining;
    String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Employee(String name, int yearOfJoining, String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.address=address;
    }
    public void showValues(){
        System.out.println("The name is:"+this.name);
        System.out.println("The joining year is:"+this.yearOfJoining);
        System.out.println("The Address id:"+address);
    }

    @Override
    public String toString() {
        return "The name is:"+this.name+" The Joining Year is :"+this.yearOfJoining+" The address is "+this.address;
    }
}
class EmployeeMoreInfo extends Employee{
    void displayInfo(){
        System.out.println(this.name + this.yearOfJoining + this.address);
    }
}
public class EmployeeConstructor {
    public static void main(String[] args) {
        Employee e1=new Employee("Robert",1994,"64C- WallsStreat");
        Employee e2=new Employee("Sam",1994,"68D- WallsStreat");
        Employee e3=new Employee("John",1994,"26B- WallsStreat");
//        e1.showValues();
//        System.out.println();
//        e2.showValues();
//        System.out.println();
//        e3.showValues();
        Employee[]arr=new Employee[3];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=new Employee();
        }
        arr[0].setName("Robert");
        arr[0].setYearOfJoining(1994);
        arr[0].setAddress("64C- WallStreet");

        arr[1].setName("Sam");
        arr[1].setYearOfJoining(1994);
        arr[1].setAddress("64C- WallStreet");

        arr[2].setName("John");
        arr[2].setYearOfJoining(1994);
        arr[2].setAddress("64C- WallStreet");



        System.out.println(Arrays.toString(arr));
//                         OR
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }
}
