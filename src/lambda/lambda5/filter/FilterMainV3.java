package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 거르기
        List<Integer> evenNumbers = filter((num) -> num % 2 == 0, numbers);
        System.out.println("evenNumbers = " + evenNumbers);

        //홀수만 거르기
        List<Integer> oddNumbers = filter((num) -> num % 2 == 1, numbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    static <T> List<T> filter(Predicate<T> predicate, List<T> numbers){

        List<T> filtered = new ArrayList<>();
        for (T number : numbers) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

}
