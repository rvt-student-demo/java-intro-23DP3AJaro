package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(this.getBalance());
    }

    public void takeFromWarehouse(double amount){
        super.takeFromWarehouse(amount);
        history.add(this.getBalance());
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() +
                            "\nHistory: " + history.toString() +
                            "\nLargest amount of product: " + history.maxValue() +
                            "\nSmallest amount of product: " + history.minValue() +
                            "\nAverage: " + history.average());
    }

    public String history(){
        return history.toString();
    }
}
