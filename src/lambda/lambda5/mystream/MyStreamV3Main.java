package lambda.lambda5.mystream;

import java.util.Arrays;
import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list = MyStreamV3.of(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("list = " + list);

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> list1 = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
        System.out.println("list1 = " + list1);

    }
}
