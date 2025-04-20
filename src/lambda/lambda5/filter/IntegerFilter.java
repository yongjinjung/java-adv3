package lambda.lambda5.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntegerFilter {
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
