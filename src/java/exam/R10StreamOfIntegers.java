package exam;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.IntSummaryStatistics;

import java.util.stream.Collectors;

// cmd: java --enable-preview --source 21 exam.R10StreamOfIntegers.java

public class R10StreamOfIntegers {
	
	public static void main(String... args) {
		List<Integer> list = List.of(1,2,3,4,9,5,7,8);
		
		Integer sum = list.stream().reduce(0, (a,n) -> a + n);
		System.out.println( STR."Sum: \{sum}");
		
		Optional<Integer> sum2 = list.stream().reduce((a,n) -> a + n);
		System.out.println( STR."Sum2: \{sum2}");
		
		long sum3 = list.stream().mapToInt(n -> n).sum();
		System.out.println( STR."Sum3: \{sum3}");
		
		// count is of type long!
		long count = list.stream().count();
		System.out.println( STR."Count: \{count}");
		
		long count2 = list.stream().mapToInt(n -> n).count();
		System.out.println( STR."Count2: \{count2}");
		
		Optional<Integer> min = list.stream().min((a,b) -> a - b);
		System.out.println( STR."Min: \{min}");
		
		OptionalInt min2 = list.stream().mapToInt(n -> n).min();
		System.out.println( STR."Min2: \{min2}");

		Optional<Integer> max = list.stream().max((a,b) -> a - b);
		System.out.println( STR."Max: \{max}");
		
		OptionalInt max2 = list.stream().mapToInt(n -> n).max();
		System.out.println( STR."Max2: \{max2}");
		
		Optional<Integer> any = list.stream().findAny();
		System.out.println( STR."Any: \{any}");
		
		Optional<Integer> first = list.stream().findFirst();
		System.out.println( STR."First: \{first}");
		
		Optional<Integer> last = list.stream().reduce((a,n) -> n);
		System.out.println( STR."Last: \{last}");
		
		double avg = (double) sum / count;
		System.out.println( STR."Avg: \{avg}");
		
		OptionalDouble avg2 = list.stream().mapToInt(n -> n).average();
		System.out.println( STR."Avg2: \{avg2}");
		
		System.out.print("Elems: ");
		list.stream().forEach(System.out::print);
		System.out.println();
		
		Map<Boolean, List<Integer>> mapOfLists = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println( STR."Even: \{mapOfLists.get(Boolean.TRUE)}");
		System.out.println( STR."Odds: \{mapOfLists.get(Boolean.FALSE)}");

		Map<Boolean, Set<Integer>> mapOfSets = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toSet()));
		System.out.println( STR."Even2: \{mapOfSets.get(Boolean.TRUE)}");
		System.out.println( STR."Odds2: \{mapOfSets.get(Boolean.FALSE)}");

		Map<Boolean, Set<Integer>> mapOfSets2 = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.toCollection(TreeSet::new)));
		System.out.println( STR."Even3: \{mapOfSets2.get(Boolean.TRUE)}");
		System.out.println( STR."Odds3: \{mapOfSets2.get(Boolean.FALSE)}");
		
		//todo: add tree set with custom comparator (with reversed order)
		
		IntSummaryStatistics stats = list.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println( STR."Stats: \{stats}");
	}
}
