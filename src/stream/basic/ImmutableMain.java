package stream.basic;

import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> originalList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("originalList = " + originalList);

        List<Integer> filteredList = originalList.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("filteredList = " + filteredList);
        System.out.println("originalList = " + originalList);
    }
}
