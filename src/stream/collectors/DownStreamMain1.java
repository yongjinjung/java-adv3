package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Hoon", 2, 90),
                new Student("Han", 3, 90),
                new Student("Han", 3, 89)

        );

        // 1단계: 학년별로 학생들을 그룹화 해라.
        Map<Integer, List<Student>> collect1_1 = students.stream().collect(
                Collectors.groupingBy(
                        student -> student.getGrade(),
                        Collectors.toList()
                )
        );
        System.out.println("collect1_1 = " + collect1_1);

        // 다운 스트림에서  toList() 생략 가능
        Map<Integer, List<Student>> collect1_2 = students.stream().collect(
                Collectors.groupingBy(Student::getGrade)
        );

        System.out.println("collect1_2 = " + collect1_2);

        //2단계 : 학년별로 학생들의 이름을 출력하라
        Map<Integer, List<String>> collect1_3 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                )
        );
        System.out.println("collect1_3 = " + collect1_3);

        //3단계: 학년별로 학생들의 수를 출력해라.
        Map<Integer, Long> collect3 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()
                )
        );
        System.out.println("collect3 = " + collect3);

        //4단계: 학년별로 학생들의 평균 성적을 출력해라.
        Map<Integer, Double> collect4 = students.stream().collect(
                Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.averagingInt(Student::getScore)
                )
        );

        System.out.println("collect4 = " + collect4);
    }

}
