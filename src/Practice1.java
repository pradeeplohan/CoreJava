import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Print all the char of the string
		String s1 = new String("Pardeep Lohan"); //string using new keyword
		allChar(s1);
		
		//2. Rev the string
		String s2 = "Pardeep Kumar Lohan"; //string literal
		revString(s2);
		
		//3. Array of names and find the count of name starts with "S"
		String[] names = new String[5];
		names[0] = "Sam";
		names[1] = "Tom";
		names[2] = "Mike";
		names[3] = "Shiv";
		names[4] = "Sakshi";
		findCount(names);
		
		//4. Array of names and sort the array and print that array
		String[] names1 = {"Sam", "Honey", "Zoo", "Eric", "Doom", "Alpfa", "Aam"};
		sortName(names1);
		
		//5. find any match in the array list with "Lohan" and print that in capital 
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Sam");
		names2.add("Lohan");
		names2.add("Sippy");
		findMatch(names2);
		
		//6. Merge two lists and print combined list
		List<String> l1 = Arrays.asList(names);
		mergeList(l1, names2);
		
		//print unique numbers in sorted form from the array of numbers
		int[] num = {6,3,7,9,5,8,3,9,5,2,5,4};
		uniqueNum(num);
		

	}

	private static void uniqueNum(int[] num) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.stream(num).boxed().collect(Collectors.toList());
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	}

	private static void mergeList(List<String> l1, ArrayList<String> names2) {
		// TODO Auto-generated method stub
		List<String> newList = Stream.concat(l1.stream(), names2.stream()).collect(Collectors.toList());
		newList.forEach(s->System.out.println(s));
	}

	private static void findMatch(ArrayList<String> names2) {
		// TODO Auto-generated method stub
		boolean a = names2.stream().anyMatch(s->s.equalsIgnoreCase("lohan"));
		System.out.println(a);
		names2.stream().filter(s->s.contains("Lohan")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

	private static void sortName(String[] names1) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList(names1);
		name.stream().sorted().forEach(s->System.out.println(s));
		
	}

	private static void findCount(String[] names) {
		// TODO Auto-generated method stub
		List<String> name =Arrays.asList(names);
		Long c = name.stream().filter(s->s.startsWith("S")).count();
		System.out.println("Total count "+c);
	}

	private static void revString(String s2) {
		// TODO Auto-generated method stub
		
		for(int i = s2.length()-1; i>-1; i--)
		{
			System.out.println(s2.charAt(i));
		}
		
	}

	private static void allChar(String s1) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
