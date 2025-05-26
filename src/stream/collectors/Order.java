package stream.collectors;


public class Order {
    String customerName;
    String product;
    int amount;

    public Order(String customerName, String product, int amount) {
        this.customerName = customerName;
        this.product = product;
        this.amount = amount;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
