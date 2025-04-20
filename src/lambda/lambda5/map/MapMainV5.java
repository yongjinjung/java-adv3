package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "orange");
        // String -> String
        List<String> upperFruits = GenericMapper.map(list, String::toUpperCase);
        System.out.println("upperFruits = " + upperFruits);

        // String -> Integer
        List<Integer> lengths = GenericMapper.map(list, String::length);
        System.out.println("lengths = " + lengths);

        //Integer -> String
        List<Integer> integers = List.of(1,2,3);
        List<String> starList = GenericMapper.map(integers, "*"::repeat);
        System.out.println("starList = " + starList);

    }

}
