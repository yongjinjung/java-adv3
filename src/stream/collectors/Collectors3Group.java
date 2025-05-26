package stream.collectors;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectors3Group {
    public static void main(String[] args) {
        // 첫 글자 알파벳을 기준으로 그룹화
        List<String> names = List.of("Apple", "Avocado", "Banana", "Blueberry", "Cherry");
        Map<String, List<String>> collect = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));

        System.out.println("collect = " + collect);

        //짝수(even)인지 여부로 분할(파티셔닝)
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("partitioned = " + partitioned);

        //부서별 사원
        List<AbstractMap.SimpleEntry<String, String>> simpleEntries = List.of(
                new AbstractMap.SimpleEntry<>("10", "김씨"),
                new AbstractMap.SimpleEntry<>("20", "문씨"),
                new AbstractMap.SimpleEntry<>("30", "사장"),
                new AbstractMap.SimpleEntry<>("10", "박씨"),
                new AbstractMap.SimpleEntry<>("20", "정씨")
        );

        Map<String, List<String>> deptGroup = simpleEntries.stream()
        .collect(Collectors.groupingBy(
                Map.Entry::getKey,
                Collectors.mapping(Map.Entry::getValue, Collectors.toList()))
        );

        System.out.println("deptGroup = " + deptGroup);
    }
}
