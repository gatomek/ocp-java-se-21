package exam.r10;

import java.util.stream.Stream;

public class EmptyStreams {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        empty.forEach(System.out::println);
    }
}