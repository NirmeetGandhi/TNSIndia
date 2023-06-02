package TNSIndia;

class Member{
    String name;
    int age;
    int PhoneNo;
    int salary;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void printDetails(){
        System.out.println("The Name is "+this.name+" The salary is "+this.salary+" age is "+this.age+" Phone is "+this.PhoneNo +" The address is "+this.address);
    }
}
class Employee1 extends Member{
    String specialization;
    String department;
}
class Manager1 extends Member{
    String specialization;
    String department;
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Member e = new Employee1();
        e.setName("Employee");
        e.setAge(34);
        e.setSalary(15000);
        e.setPhoneNo(999999);
        e.setAddress("India");
        e.printDetails();

        Member m=new Manager1();
        m.setName("Manager");
        m.setAge(50);
        m.setSalary(100000);
        m.setPhoneNo(888888);
        m.setAddress("USA");
        m.printDetails();


    }
}
