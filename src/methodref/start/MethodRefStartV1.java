package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        BinaryOperator<Integer> sum2 = (a, b) -> a + b;


        Integer apply = sum.apply(1, 2);
        System.out.println("apply = " + apply);
        Integer apply1 = sum2.apply(1, 2);
        System.out.println("apply1 = " + apply1);
    }
}
