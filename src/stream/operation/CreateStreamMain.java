package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {

    public static void main(String[] args) {
        System.out.println("1. 컬렉션으로부터 생성");
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        System.out.println("2. 배열로부터 생성");
        String[] arr = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        System.out.println("4. 무한 스트림 생성 - iterate()");
        Stream<Integer> stream3 = Stream.iterate(0, n -> n + 2);
        stream3.limit(3).forEach(System.out::println);

        System.out.println("5. 무한 스트림 생성 - generate()");
        //generate: Supplier 를 사용하여 무한하게 생성
        Stream<Double> stream4 = Stream.generate(Math::random);
        stream4.limit(3).forEach(System.out::println);
    }
}
