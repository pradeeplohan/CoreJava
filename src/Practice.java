import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Array of numbers and check for odd and even numbers
		int[] num=new int[5]; //print even numbers
		num[0]=3;
		num[1]=7;
		num[2]=6;
		num[3]=5;
		num[4]=4;
		for(int i=0; i<num.length; i++)	
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" Even Number");
			}
		}
		
		int[] num1= {2,3,6,7,8,22,65,34,78,93,54,67};//print odd numbers
		for(int i : num1)
		{
			if(i%2==1)
			{
				System.out.println(i+" Odd Number");
			}
		}
		
		//convert Array into arraylist
		
		String[] name=new String[3];
		name[0]= "MR.";
		name[1]= "Pardeep";
		name[2]= "Lohan";
		List<String> nameList = Arrays.asList(name);
		//nameList.remove(2);
		//nameList.add("Luhaniwal");

		for(int i=0; i<nameList.size(); i++) 
		{
			System.out.println(nameList.get(i));
			if(nameList.contains("Luhaniwal"))
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		
		//print all characters of the string 
		String s="PARDEEP"; //for printing characters of a string use "charAt()" method
		for (int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//split the string from white space and middle word
		String s1="Mr. Pardeep Kumar Lohan S/o Birbal";
		String[] s1Arr = s1.split(" ");
		for(int i=0; i<s1Arr.length; i++)
		{
			System.out.println(s1Arr[i]);
		}
			
		String[] s1Split1=s1.split("Mr.");
		//0-> null
		//1->  Pardeep Kumar Lohan S/o Birbal
		System.out.println(s1Split1[1]);
		
		String[] s1Split2 = s1Split1[1].split("S/o");
		//0-> Pardeep Kumar Lohan 
		//1->  Birbal

		//0th index
		String[] s1Split3 = s1Split2[0].split(" ");
		for(String s2 : s1Split3)
		{
			System.out.println(s2);
		}
		
		//1st index
		System.out.println(s1Split2[1].trim());
		
		//Reverse the string s1
		for(int i=s1.length()-1; i>=0; i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		//create a arraylist
		ArrayList<String> newArr1=new ArrayList<String>();
		newArr1.add("Hello");
		newArr1.add("Mr.");
		newArr1.add("Lohan");
		
		for(String s2:newArr1)
		{
			System.out.println(s2);
		}
		
		for(int i=0; i<newArr1.size(); i++)
		{
			System.out.println(newArr1.get(i));
		}
		
	}

}
