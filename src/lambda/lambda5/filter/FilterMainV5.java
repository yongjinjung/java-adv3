package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 거르기
        List<Integer> evenNumbers = GenericFilter.filter(numbers, (num) -> num % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        //홀수만 거르기
        List<Integer> oddNumbers = GenericFilter.filter( numbers, (num) -> num % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);

        //문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        List<String> StringsResult = GenericFilter.filter(strings, (str) -> str.length() > 2);
        System.out.println("StringsResult = " + StringsResult);
    }
}
