import java.sql.SQLOutput;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.math.BigDecimal;
public class withdrawal {
    int amountd;
    int amountw;
    void deposit()
    {   System.out.println("***** WELCOME******");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String userName=sc.nextLine();

        System.out.println("Enter Amount to be deposited");
        amountd=sc.nextInt();
        System.out.println("Name \t"+userName);
        System.out.println(" Amount Deposited: \t"+amountd);

    }
    void withdraw()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String userName=sc.nextLine();
        System.out.println("Enter Amount to be withdraw");
        amountw=sc.nextInt();
        System.out.println("Name: \t"+userName);
        System.out.println(" Ammount withdraw: \t"+amountw);
        System.out.println("Remaining Amount: \t"+(amountd-amountw));

    }
    void accNo() {
        System.out.println("Do You Have An Account Number Y/N");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.out.println("Enter your Account Number");
            int acc1=sc.nextInt();
            choice();
        } else if (ch=='n'||ch=='N') {
            RanGen();
            choice();
        }
        ArrayList<Integer> mk = new ArrayList<Integer>();
            Scanner a = new Scanner(System.in);
            while (a.hasNextInt()) {
                int i = a.nextInt();
                mk.add(i);
                System.out.println("your account number :");
        }
    }
    void choice()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Choice");
        System.out.println("1.Amount Deposit ");
        System.out.println("2.Amount withdraw");
        System.out.println("3.Check Balance");
        System.out.println("4. Exit");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1: System.out.println(" Amount Deposit");
                     deposit();
                     choice();

                break;
            case 2: System.out.println("Amount Withdrawn");
                    withdraw();
                choice();
                break;
            case 3:
                System.out.println("Check Balance");
                checkBalance();
                choice();
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default: System.out.println("wrong account");
            choice();
                break;
        }
    }
    void checkBalance()
    {
        int rembal=amountd-amountw;
        System.out.println("Your Balance :"+rembal);
    }
    void RanGen()
    {   Random rand=new Random();
        int upperbound=100;
        int newAcc=rand.nextInt(upperbound);
        System.out.println(" New Account Number:"+newAcc);
    }
    public static void main(String[] args)
    {
        withdrawal w1=new withdrawal();
        w1.accNo();
    }
}
