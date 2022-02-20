//Implement a banking system using java.
//        Create 3 sub class of Bank : SBI,BOI,ICICI
//        All 4 should have following methods:
//          - getDetails which provide their specific details like rateofinterest etc
//          - printDetails of every bank.
//          - Every bank account should have a type (enum): SAVINGS, CURRENT
//          - Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
//          - Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)

import java.io.*;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) throws IOException {
        System.out.println("choose the bank operation: ");
        System.out.println(" 1. Open Account\n 2. Deposit \n 3. Withdraw \n 4. Check Balance \n 5. Enter 0 to exit");
        int num = 1;
        Scanner sc = new Scanner(System.in);
        SBI s = null;
        SBI s1 = null;
        SBI s2 = null;
        BOI b = null;
        BOI b2 = null;
        ICICI i = null;
        FileWriter fw = null;
            fw = new FileWriter(new File("Bank.txt"));
            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter("Bank.txt",true));
        while (num != 0) {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    s = new SBI("Ashita", 10000, Bank.acc_type.SAVINGS);
                    s1 = new SBI("Kratika", 12000, Bank.acc_type.CURRENT);
                    s2 = new SBI("Rohit", 10500, Bank.acc_type.SAVINGS);
                    b = new BOI("Aditi", 20000, Bank.acc_type.SAVINGS);
                    b2 = new BOI("Naman", 23000, Bank.acc_type.SAVINGS);
                    i = new ICICI("Ankit", 23000, Bank.acc_type.CURRENT);
                    writer.write(s.toString());
                    writer.write(s1.toString());
                    writer.write(s2.toString());
                    writer.write(b.toString());
                    writer.write(b2.toString());
                    writer.write(i.toString());
                    break;
                case 2:
                    s.deposit(1000);
                    s1.deposit(10000);
                    s2.deposit(13000);
                    b.deposit(1000);
                    b2.deposit(1400);
                    i.deposit(10800);
                    break;
                case 3:
                    s.withdraw(40000);
                    s1.withdraw(40000);
                    s2.withdraw(40000);
                    b.withdraw(40000);
                    b2.withdraw(40000);
                    i.withdraw(40000);
                    break;
                case 4:
                    s.checkBalance();
                    s1.checkBalance();
                    s2.checkBalance();
                    b.checkBalance();
                    b2.checkBalance();
                    i.checkBalance();
                    break;
            }

        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
