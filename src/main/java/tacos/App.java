package tacos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> stream = Arrays.stream(arr);
		System.out.println(stream);
		stream = Stream.of("a", "b", "c");
		System.out.println(stream);

		List<String> list = Arrays.asList("saas", "ass");
		System.out.println(list.stream().filter(e -> e.contains("sa")));

	}

}
