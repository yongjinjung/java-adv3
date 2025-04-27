package stream.basic;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvalMain2 {

    /**
     * 최종 연사을 수행해야 작동한다.
     * 자바 스트림은  toList() 와 같은 최종 연산을 수행할 때만 작동한다.
     * 여기서는 최종 연산을 제외했다.
     */
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ex1(data);
        ex2(data);
    }

    private static void ex2(List<Integer> data) {
        System.out.println(" Stream Api Start");
        Stream<Integer> list = data.stream()
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
                });
        System.out.println(" Stream Api End");
    }

    private static void ex1(List<Integer> data) {
        System.out.println("== MyStreamV3 시작 ==");
        MyStreamV3.of(data)
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
                });
        System.out.println("MyStreamV3 종료");
    }


}
