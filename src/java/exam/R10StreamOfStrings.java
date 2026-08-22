package exam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class R10StreamOfStrings {

    public static void main(String[] args) {

        // NATO phonetic alphabet
        List<String> list = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf");

        Map<String, Integer> strToLenMap = list.stream().collect(Collectors.toMap(k -> k, k -> k.length()));
        System.out.println(strToLenMap);

        Map<Integer, List<String>> lenToStrMap = list.stream().collect(Collectors.groupingBy(k -> k.length(), Collectors.toList()));
        System.out.println(lenToStrMap);

        Integer totalLen = list.stream().map(s -> s.length()).mapToInt(n -> n).sum();
        System.out.println(totalLen);

        Integer totalLen2 = list.stream().collect(Collectors.summingInt(s -> s.length()));
        System.out.println(totalLen2);

        Map<Integer, Long> lenToStrCountMap = list.stream().collect(Collectors.groupingBy(k -> k.length(), Collectors.counting()));
        System.out.println(lenToStrCountMap);

        String reduced = list.stream().reduce("", (a, s) -> a + s + ",");
        System.out.println(reduced);

        String reduced2 = list.stream().collect(Collectors.joining(","));
        System.out.println(reduced2);

        // mutable reduction
        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#MutableReduction
        String reduced3 = list.stream().collect(StringBuilder::new, (a, s) -> a.append(s), (a, s) -> a.append(s)).toString();
        System.out.println(reduced3);


        // shortest string


        // longest string

        List<String> sorted = list.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println(sorted);

        List<String> sorted2 = list.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println(sorted2);

        List<String> sorted3 = list.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(sorted3);
    }
}
