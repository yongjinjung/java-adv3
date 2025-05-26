package stream.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class DownStreamMain2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Hoon", 2, 90),
                new Student("Han", 3, 90),
                new Student("Han", 3, 89)
        );

        //1단계: 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> collect1_1 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade
                )
        );
        System.out.println("collect1_1 = " + collect1_1);

        //2단계: 학년별로 가장 점수가 높은 학생을 구해라. reducing 사용
        Map<Integer, Optional<Student>> collect1_2 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.reducing((s1, s2)-> s1.getScore() > s2.getScore() ? s1: s2)
                )
        );
        System.out.println("collect1_2 = " + collect1_2);

        // 3 단계: 학년별로 가장 점수가 높은 학생을 구해라. maxBy 사용
        Map<Integer, Optional<Student>> collect3 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.maxBy(Comparator.comparing(Student::getScore))
                )
        );

        System.out.println("collect = " + collect3);

        //4단계: 학년별로 가장 점수가 높은 학생의 이름을 구해라 (collectingAndThen + maxBy 사용)
        Map<Integer, String> collect4 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getScore)),
                                sOpt -> sOpt.get().getName()
                        )
                )
        );

        System.out.println("collect4 = " + collect4);
    }
}
