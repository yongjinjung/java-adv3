package lambda.lambda5.filter;

import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        return list.stream().filter(predicate).toList();
    }
}
