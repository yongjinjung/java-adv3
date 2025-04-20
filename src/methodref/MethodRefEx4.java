package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Kim"));
        personList.add(new Person("Park"));
        personList.add(new Person("Lee"));

        List<String> result1 = mapPersonToString(personList, (Person p) -> p.introduce());
        List<String> result2 = mapPersonToString(personList, Person::introduce);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        List<String> upperResult1 = mapStringToString(result1, (String s) -> s.toUpperCase());
        List<String> upperResult2 = mapStringToString(result2, String::toUpperCase);
        System.out.println("upperResult1 = " + upperResult1);
        System.out.println("upperResult2 = " + upperResult2);
    }

    private static List<String> mapStringToString(List<String> result1, Function<String, String> fn) {
        List<String> result = new ArrayList<>();
        for (String s : result1) {
            String apply = fn.apply(s);
            result.add(apply);
        }

        return result;
    }

    private static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fn) {

        List<String> resultList = new ArrayList<>();
        for (Person person : personList) {
            String applied = fn.apply(person);
            resultList.add(applied);
        }

        return resultList;
    }


}
