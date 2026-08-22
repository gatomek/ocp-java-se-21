package exam;

import java.util.stream.Stream;

public class R10EmptyStreams {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        empty.forEach(System.out::println);
    }
}