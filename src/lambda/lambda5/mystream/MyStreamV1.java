package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> internalList;
    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public List<Integer> toList() {
        return internalList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer integer : internalList) {
            if (predicate.test(integer)) {
                filteredList.add(integer);
            }
        }

        return new MyStreamV1(filteredList);
    }

    public MyStreamV1 map(Function<Integer, Integer> function) {
        List<Integer> mappedList = new ArrayList<>();
        for (Integer integer : internalList) {
            mappedList.add(function.apply(integer));
        }
        return new MyStreamV1(mappedList);
    }

}
