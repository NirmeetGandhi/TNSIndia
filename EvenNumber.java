package TNSIndia;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no");
        int inp = sc.nextInt();
        for (int i = 0; i <=inp; i++) {
            if (inp%2==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
    }
}
