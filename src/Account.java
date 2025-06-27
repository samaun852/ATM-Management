import javax.swing.*;

public class Account  {


   public static int balance=5000;
   public static int money;
   public static int amount;


    // i need to add some functions(Methods)

    public static int Check_Balance(){

        return  balance;
    }


    public static int withdraw_Money(int amount){

        balance=balance-amount;
        return balance;
    }

    public static int deposit_Money(int money){

        balance=balance+money;
        return balance;
    }




}

