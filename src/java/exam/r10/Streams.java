package exam.r10;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        // NATO phonetic alphabet
        List<String> list = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf");

        // list forEach loop
        list.forEach(System.out::println);

        // list stream forEach loop
        list.stream().forEach(System.out::println);
    }

}