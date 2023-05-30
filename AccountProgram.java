package TNSIndia;

import java.util.Scanner;

class Account{
    String name;
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

//    Account(String name){
//        this.name=name;
//    }
    public long acntNumber;
    public int withMoney;
    int totalBal=3000;

    public void setAcntNumber(long acntNumber){
        this.acntNumber=acntNumber;
    }

    public long getAcntNumber() {
        return acntNumber;
    }
    public void withdrawMoney(long amount){
        if (totalBal-amount<=1000){
            System.out.println("Sorry you can't withdraw");
        }
        else{
            System.out.println("Successfully withdrawn " + amount +" from " + acntNumber);
            totalBal -= amount;
            System.out.println("Remaining bal of account "+acntNumber+ " is " + totalBal );
        }
    }
    public void depositMoney(long amount){
        totalBal += amount;
        System.out.println("Money added successfully");
        System.out.println("Updated Balance is "+totalBal);
    }
    @Override
    public String toString(){
        return name;
    }

}
public class AccountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        long acntNumber = sc.nextLong();
        Account ac = new Account();
        ac.setAcntNumber(acntNumber);
        int choice;
        do {
            System.out.println("Enter 1 to deposit money, 2 to withdraw,3 to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the money to deposit");
                    long depositAmount = sc.nextLong();
                    ac.depositMoney(depositAmount);
                    break;
                case 2:
                    Account sh = new Account();
                    System.out.println("Available Money "+sh.totalBal);
                    System.out.println("Enter amount to withdraw");
                    long inp = sc.nextLong();
                    ac.withdrawMoney(inp);
                    break;
                case 3:
                    return;
            }
        }while (choice != 3) ;
        System.out.println("Thank you very much for visiting...");
    }
}
