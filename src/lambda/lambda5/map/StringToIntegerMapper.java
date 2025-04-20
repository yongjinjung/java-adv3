package lambda.lambda5.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToIntegerMapper {
    public static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        return list.stream().map(mapper).collect(Collectors.toList());
    }
}
