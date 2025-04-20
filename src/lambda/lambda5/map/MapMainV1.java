package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);
        List<Integer> lengths = mapStringToLength(list);
        System.out.println("lengths = " + lengths);

    }

    //문자열을 숫자로 변환
    static List<Integer> mapStringToInteger(List<String> list){
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    //문자열의 길이
    static List<Integer> mapStringToLength(List<String> list){
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.length());
        }
        return result;
    }
}
