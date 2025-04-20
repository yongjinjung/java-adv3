package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV2 {
    private List<Integer> internalList;
    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    //static factory
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public List<Integer> toList() {
        return internalList;
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer integer : internalList) {
            if (predicate.test(integer)) {
                filteredList.add(integer);
            }
        }

        return new MyStreamV2(filteredList);
    }

    public MyStreamV2 map(Function<Integer, Integer> function) {
        List<Integer> mappedList = new ArrayList<>();
        for (Integer integer : internalList) {
            mappedList.add(function.apply(integer));
        }
        return new MyStreamV2(mappedList);
    }

}
