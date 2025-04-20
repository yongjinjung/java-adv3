package lambda.lambda5.mystream;

import java.util.Arrays;
import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        MyStreamV1 map = new MyStreamV1(numbers).filter(n -> n % 2 == 0).map(n -> n * 2);
        System.out.println("map = " + map.toList());


        MyStreamV1 stream = new MyStreamV1(numbers);
        List<Integer> list = stream.filter(n -> n % 2 == 0).map(n -> n * 2).toList();
        System.out.println("list = " + list);
    }
}
