package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_Number {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);
        List<Integer> lambda = lambda(numbers);
        System.out.println("lambda = " + lambda);
    }

    static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }
        return result;
    }

    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filters = GenericFilter.filter(numbers, n -> n % 2 == 0);
        return GenericMapper.map(filters, n -> n * 2);
    }
}
