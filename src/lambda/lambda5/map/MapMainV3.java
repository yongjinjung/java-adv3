package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV3 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        List<Integer> numbers = map(list, Integer::parseInt);
        System.out.println("numbers = " + numbers);

        List<Integer> lengths = map(list, String::length);
        System.out.println("lengths = " + lengths);

        numbers = genericMap(list, Integer::parseInt);
        System.out.println("numbers = " + numbers);

        lengths = genericMap(list, String::length);
        System.out.println("lengths = " + lengths);
    }

    //문자열을 숫자로 변환
    static <T, R> List<R> genericMap(List<T> list, Function<T, R> fn){
        List<R> result = new ArrayList<>();
        for (T s : list) {
            result.add(fn.apply(s));
        }
        return result;
    }

    static List<Integer> map(List<String> list, Function<String, Integer> fn){
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(fn.apply(s));
        }
        return result;
    }

}
