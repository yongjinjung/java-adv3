package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMapping {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("홍길동", "TV", 2),
                new Order("홍길동", "냉장고", 1),
                new Order("이순신", "노트북", 1),
                new Order("정용진", "집", 2)
        );
        
        Map<String, List<OrderDto>> customerNames = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.customerName,
                        Collectors.mapping(order -> new OrderDto(order.product, order.amount), Collectors.toList())
                ));
        System.out.println("customerNames = " + customerNames);

    }
}
