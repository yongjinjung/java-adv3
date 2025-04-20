package lambda.lambda5.mystream;

import java.util.Arrays;
import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        MyStreamV3.of(students)
                .filter( s-> s.getScore() >= 80)
                .map(Student::getName)
                .forEach(System.out::println);

    }
}
