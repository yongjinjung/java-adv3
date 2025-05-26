package stream.collectors;

public class OrderDto {
    String product;
    int amount;

    public OrderDto(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public String toString() {
        return product + "(" + amount + ")";
    }
}
