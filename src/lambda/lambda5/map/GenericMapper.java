package lambda.lambda5.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMapper {
    public static <T,R> List<R> map(List<T> list, Function<T, R> fn){
        return list.stream().map(fn).collect(Collectors.toList());
    }
}
