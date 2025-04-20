package lambda.lambda;

public class GenericMain4 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = String::toUpperCase;
        String hello = upperCase.apply("Hello");
        System.out.println("hello = " + hello);

        GenericFunction<Integer, Integer> square = n -> n * n;
        int apply = square.apply(5);
        System.out.println("apply = " + apply);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
