package stream.collectors;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4MinMax {
    public static void main(String[] args) {

        // 다운스트림 컬렉ㅌ에서 유용하게 사용
        Integer max1 = Stream.of(1, 2, 3)
                .collect(Collectors.maxBy((a, b) -> a.compareTo(b)))
                .get();
        System.out.println("max1 = " + max1);

        Integer max2 = Stream.of(1,2,3)
                .max((a, b) -> a.compareTo(b)).get();
        System.out.println("max2 = " + max2);

        Integer max3 = Stream.of(1,2,3)
                .max(Integer::compare).get();
        System.out.println("max3 = " + max3);

        Integer max4 = Stream.of(1, 2,3)
                .max(Comparator.naturalOrder()).get();
        System.out.println("max4 = " + max4);
        
        //기본형 특화 스트림 사용
        int intMax4 = IntStream.of(1,2,3)
                .max().getAsInt();
        System.out.println("intMax4 = " + intMax4);

        Integer min1 = Stream.of(1,2,3)
                .collect(Collectors.minBy((a, b)-> a.compareTo(b)))
                .get();
        System.out.println("max2 = " + min1);

    }
}
