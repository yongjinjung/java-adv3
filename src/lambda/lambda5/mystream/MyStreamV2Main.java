package lambda.lambda5.mystream;

import java.util.Arrays;
import java.util.List;

public class MyStreamV2Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list = MyStreamV2.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("list = " + list);
    }
}
