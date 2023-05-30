package TNSIndia;

import java.util.Arrays;

public class ArrayObject {
    public static void main(String[] args) {
//        Account ac1 = new Account("Nirmeet");
//        Account ac2 = new Account("Test");
//        Account ac3 = new Account("ABC");
//        Account ac4 = new Account("DEF");
//        Account ac5 = new Account("GHI");
        Account [] obj = new Account[5];
        for (int i = 0; i < obj.length; i++) {
            obj[i]=new Account();
        }
        obj[0].setName("Nirmeet");
        obj[1].setName("abc");
        obj[2].setName("bcd");
        obj[3].setName("def");
        obj[4].setName("ghi");

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
            //or
//            System.out.println(obj[i].getName());

        }


    }
}
