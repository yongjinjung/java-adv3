package stream.basic;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LazyEvalMain3 {

    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ex1(data);
        ex2(data);
    }

    private static void ex2(List<Integer> data) {
        System.out.println(" Stream Api Start");
         Optional<Integer> op =  data.stream()
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행: " + i + "(" + isEven +
                            ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행: " + i + " -> " + mapped);
                    return mapped;
                })
                 .findFirst();
        System.out.println("op.orElse(0) = " + op.orElse(0));
        System.out.println(" Stream Api End");
    }

    private static void ex1(List<Integer> data) {
        System.out.println("== MyStreamV3 시작 ==");
        Integer first = MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행: " + i + "(" + isEven +
                            ")");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행: " + i + " -> " + mapped);
                    return mapped;
                })
                .getFirst();
        System.out.println("first= " + first);
        System.out.println("MyStreamV3 종료");
    }


}
