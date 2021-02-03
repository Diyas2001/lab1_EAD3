package org.example;

public class Accounts {
    int card;
    String pin;
    double balance;

    public Accounts(int card, String pin, double balance) {
        this.card = card;
        this.pin = pin;
        this.balance = balance;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
