package exam;

import java.util.List;

public class R10Streams {

    public static void main(String[] args) {
        //
        List<String> list = List.of("alpha", "bravo", "charlie", "delta", "epsilon", "foxtrot");

        // list forEach loop
        list.forEach(System.out::println);

        // list stream forEach loop
        list.stream().forEach(System.out::println);
    }

}