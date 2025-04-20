package lambda.lambda;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = String::toUpperCase;
        String hello = upperCase.apply("Hello");
        System.out.println("hello = " + hello);

        NumberFunction square = number -> number * number;
        int apply = square.apply(5);
        System.out.println("apply = " + apply);
    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        int apply(int n);
    }
}
