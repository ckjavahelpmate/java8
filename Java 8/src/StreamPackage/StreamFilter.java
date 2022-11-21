package StreamPackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("a","b","c") ;
		stream.forEach((i)->System.out.println(i));
		
		Collection<String> collection = Arrays.asList("Tamil", "Ck", "Nischal") ;
		Stream<String> stream2 = collection.stream() ;
		stream2.forEach(System.out::println);
		
		String[] str = { "Tamil", "Ck", "Nischal" } ;
		List<String> list = Arrays.asList(str) ;
		Stream<String> stream3 = list.stream() ;
		stream3.forEach(System.out::println);

	}

}
