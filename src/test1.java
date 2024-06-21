import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {
	@Test
	public void regular() {

		// count the number of names Starting with Alphabet with A in the list

		ArrayList<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Soheib");
		names.add("Montu");
		names.add("Ashraf");
		names.add("Shahid");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
			System.out.println(count);
		}
	}
	@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("shabazz");
		names.add("shafi");
		names.add("Nouman");
		names.add("fazil");
		names.add("Vishal");
		// There is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate operation(filter) returns true
		// We can create stream
		// How to use filter in streams API
		Long c= names.stream().filter(s->s.startsWith("N")).count();
		System.out.println(c);
		// Insted of converting Varable into Streams we can directly add streams as below 
//		Long d = Stream.of("shabazz","shafi","Nouman","fazil","Vishal").filter(s->s.startsWith("V"));
		
	};
}
