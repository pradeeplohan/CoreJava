import java.util.HashSet;
import java.util.Set;

public class InterviewQus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. find a missing number from a series 
		int[] num = {-1,0,1,2,4,5};
		int sum1 = 0;
		int sum2 = 0;
		for(int i =0; i<num.length; i++) {
			sum1 = sum1 + num[i];
		}
		//System.out.println(num[num.length-1]);
		for(int j =num[0]; j<=num[num.length-1]; j++) {
			sum2 = sum2 + j;
		}
		System.out.println("Missing number is::"+(sum2-sum1));
		
		//2. Reverse of a string
		//a) using for loop
		String name = "Pardeep";
		String rev = "";
		for (int i = name.length()-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		//b) using string buffer
		StringBuffer bff = new StringBuffer(name);
		System.out.println(bff.reverse());
		
		//3. Reverse a number
		//a using while loop
		int num1 = 3568;
		int rev1 = 0;
		while(num1!=0) {
			rev1 = rev1*10 + num1%10;
			num1 = num1/10;
		}
		System.out.println(rev1);
		
		//b using string buffer
		int num2 = 3568;
		StringBuffer numbff = new StringBuffer(String.valueOf(num2));
		System.out.println(numbff.reverse());
		
		//4. Remove from junk from a string
		String junk = "78#$@$im %Loha#n%$^";
		System.out.println(junk.replaceAll("[^a-zA-Z0-9]", ""));
		
		//5. Find duplicate value from a array of strings
		String[] names = {"c","C++","java","Ruby","Java", "c", "java"};
		//using two for loop
		for(int i = 0 ; i < names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate string is::"+names[i]);
				}
					
			}
				
		}
		
		//Using hashset becoz it cant store duplicate value
		Set<String> store = new HashSet<String>();
		for(String name1 : names) {
			if(store.add(name1) == false) {
				System.out.println("Dulicate String found::"+name1);
			}
		}

	}

}
