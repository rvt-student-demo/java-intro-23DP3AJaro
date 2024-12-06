package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            affordableMeals = affordableMeals + 1;
            money = money + 2.50;
            return payment - 2.50;
        } 
        return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            heartyMeals = heartyMeals + 1;
            money = money + 4.30;
            return payment - 4.30;
        }
        return payment;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatAffordably(PaymentCard card) {
        boolean success = false;
        if (card.balance() >= 2.50) {
            card.Payment(2.50);
            success = true;
            affordableMeals = affordableMeals + 1;
            return success;
        }
        return success;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean success = false;
        if (card.balance() >= 4.30) {
            card.Payment(4.30);
            success = true;
            heartyMeals = heartyMeals + 1;
            return success;
        }
        return success;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
