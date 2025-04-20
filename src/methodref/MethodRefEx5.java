package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class MethodRefEx5 {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );


        List<String> list1 = MyStreamV3.of(personList)
                .map(person -> person.introduce())
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println("list1 = " + list1);

        List<String> list = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("list = " + list);


    }
}
