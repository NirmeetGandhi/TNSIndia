package TNSIndia;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Enter 3 nos");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int avg =(num1+num2+num3)/3;
        if (avg>=90){
            System.out.println("Excellent Grade A");
        }
        else if(avg>=80&&avg<90){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
    }
}
