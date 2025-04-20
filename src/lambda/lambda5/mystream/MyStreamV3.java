package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T> {
    private final List<T> internalList;
    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    //static factory
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public void forEach(Consumer<T> action) {
        for (T t : internalList) {
            action.accept(t);
        }
    }


    public List<T> toList() {
        return internalList;
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T integer : internalList) {
            if (predicate.test(integer)) {
                filteredList.add(integer);
            }
        }

        return MyStreamV3.of(filteredList);
    }

    public <R> MyStreamV3<R> map(Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();
        for (T t : internalList) {
            mappedList.add(function.apply(t));
        }
        return MyStreamV3.of(mappedList);
    }

}
