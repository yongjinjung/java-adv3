package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        Function<String, Integer> fn = Integer::parseInt;
        List<Integer> numbers = map(list, fn);
        System.out.println("numbers = " + numbers);

        Function<String, Integer> fn2 = String::length;
        List<Integer> lengths = map(list, fn2);
        System.out.println("lengths = " + lengths);

        numbers = genericMap(list, fn);
        System.out.println("numbers = " + numbers);

        lengths = genericMap(list, fn2);
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
