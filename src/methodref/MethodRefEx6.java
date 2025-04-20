package methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {
    public static void main(String[] args) {
        //4. 임의 객체의 인스턴스 메서드 참조(특정 타입의)
        Person person = new Person("Kim");

        //람다
        BiFunction<Person, Integer, String> fn1 = (Person p, Integer n) -> p.introduceWithNumber(n);
        System.out.println("fn1 = " + fn1.apply(person, 1));

        //메서드 참조, 타입이 첫 변째 매개변수가 됨, 그리고 첫 번째 매개변수의 메서드를 호출
        //나머지는 순서대로 매개변수에 전달
        //타입::메서드
        BiFunction<Person, Integer, String> fn2 = Person::introduceWithNumber;
        System.out.println("fn2 = " + fn2.apply(person, 2));
    }
}
