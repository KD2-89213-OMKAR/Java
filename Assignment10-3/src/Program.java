
public class Program {
	import java.util.IntSummaryStatistics;
	import java.util.stream.IntStream;

	public class Q3 {

		public static void main(String[] args) {
			IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
	        System.out.println("Count: " + stats.getCount());
	        System.out.println("Min: " + stats.getMin());
	        System.out.println("Max: " + stats.getMax());
	        System.out.println("Average: " + stats.getAverage());
	        System.out.println("Sum (from stats): " + stats.getSum());

		}

	}


}
