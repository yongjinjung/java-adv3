package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = MethodRefStartV3::add;
        BinaryOperator<Integer> sum2 = MethodRefStartV3::add;

        Integer result = sum.apply(1, 2);
        System.out.println("result = " + result);
        Integer result2 = sum2.apply(1, 2);
        System.out.println("result2 = " + result2);

    }

    static int add(int a, int b) {
        return a + b;
    }
}
