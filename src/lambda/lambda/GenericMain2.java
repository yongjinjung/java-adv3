package lambda.lambda;

public class GenericMain2 {
    public static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        String hello = (String)upperCase.apply("Hello");
        System.out.println("hello = " + hello);

        ObjectFunction square = number -> (Integer)number * (Integer)number;
        int apply = (Integer)square.apply(5);
        System.out.println("apply = " + apply);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object o);
    }

}
