package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String productName;

    ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        productName = newName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
