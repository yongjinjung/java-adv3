package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV2 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> add(a, b);
        BinaryOperator<Integer> sum2 = (a, b) -> add(a, b);

        Integer result = sum.apply(1, 2);
        System.out.println("result = " + result);
        Integer result2 = sum2.apply(1, 2);
        System.out.println("result2 = " + result2);

    }

    static int add(int a, int b) {
        return a + b;
    }
}
