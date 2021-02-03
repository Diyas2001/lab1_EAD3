package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ATMSystemTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");
        Accounts account1 = context.getBean("account1", Accounts.class);
        Accounts account2 = context.getBean("account2", Accounts.class);
        Accounts account3 = context.getBean("account3", Accounts.class);

        AccountList accountList = context.getBean("accountList", AccountList.class);
        accountList.Add(account1);
        accountList.Add(account2);
        accountList.Add(account3);

        for (int i=0; i<10; i++) {
            System.out.println("Card number");
            int card = sc.nextInt();
            System.out.println("Pin code");
            String pin = sc.next();
            for (Accounts accounts : accountList.getAccountList()) {
                if (card == accounts.getCard() && accounts.getPin().equals(pin)) {
                    System.out.println("Correct");
                    System.out.println("What do you want?");
                    System.out.println("1. Check balance" +
                            "\n2. Withdraw" +
                            "\n3. Top up");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Balance : " + accounts.getBalance());
                            break;
                        case 2:
                            System.out.println("Withdraw amount");
                            int withdraw = sc.nextInt();
                            accounts.setBalance(accounts.getBalance() - withdraw);
                            System.out.println("Balance: " + accounts.getBalance());
                            break;
                        case 3:
                            System.out.println("Top up amount");
                            int topUp = sc.nextInt();
                            accounts.setBalance(accounts.getBalance() + topUp);
                            System.out.println("Balance:" + accounts.getBalance());
                            break;
                    }
                }
            }
        }
        context.close();
    }
}