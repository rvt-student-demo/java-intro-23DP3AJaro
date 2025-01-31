package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        } else if (amount > howMuchSpaceLeft()) {
            this.balance = this.capacity;
        } else {
            this.balance = this.balance + amount;
        }
    }

    public void takeFromWarehouse(double amount) {
        if (amount < 0) {

        } else if (amount > balance) {
            this.balance = 0;
        } else {
            this.balance = this.balance - amount;
        }
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + " space left " + howMuchSpaceLeft();
    }
}
