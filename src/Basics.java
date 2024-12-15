import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myNum= {1,2,5,6,8,10,13,15,30,44,55,88,99,100};
		//print all numbers divided by 2
		for(int i=0; i<myNum.length; i++) {
			//for loop for accessing array index values
			if(myNum[i] % 2 == 0) {
				System.out.println(myNum[i]);
			}
			else {
				System.out.println(myNum[i]+" is not divided by 2");
			}
		}

		//Find any number divided by 3 
		for(int num:myNum)
		{
			if(num%3==0) {
				System.out.println(num +" Yes, Found a number didived by 3");
				break;
			}
		}
		
		//ArrayList - A dynamic array
		ArrayList<String> a=new ArrayList<String>();
		a.add("Pardeep"); //adding value in arraylist
		a.add("Lohan");
		a.add("Hello");
		a.add("World!");
		System.out.println(a.get(3)); //get value from arraylist using index
		
		//print arraylist values
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println("*****************");
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		//Check item "Lohan" present in arraylist or not
		System.out.println(a.contains("Lohan"));
		
		//Covert traditional array to arraylist and use conatins() method
		String[] name= {"Pardeep", "LOHAN"};
		List<String> nameArr = Arrays.asList(name);
		System.out.println(nameArr.contains("Lohan")); 
		
		//Strings in java - String is an object that represent sequence of characters
		String s = "Pardeep Kumar Lohan";
		
		//trim the white space and break the string into three different words
		String[] splArr = s.split(" ");
		System.out.println(splArr[0]); //Pardeep
		System.out.println(splArr[1]); //Kumar
		System.out.println(splArr[2]); //Lohan
		
		//split the string according to middle word
		String[] splArr2=s.split("Kumar");
		System.out.println(splArr2[0]); //Pardeep
		System.out.println(splArr2[1]); // Lohan
		System.out.println(splArr2[1].trim()); //for trim white space from left and right
		
		//print characters of string
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//Print reverse of the string
		for(int i = s.length()-1; i>=0; i--) 
		{
			System.out.print(s.charAt(i));
		}
	
		
	}

}
