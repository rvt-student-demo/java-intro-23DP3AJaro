package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public void Payment(double amount){
        balance = balance - amount;
    }

    public boolean takeMoney(double amount) {
        boolean success = false;
        if (amount <= balance) {
            balance = balance - amount;
            success = true;
        }
        return success;
    }
}
