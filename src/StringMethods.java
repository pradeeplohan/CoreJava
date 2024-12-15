
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "MR. Pardeep Lohan";
		
		//print the string
		System.out.println(name);
		
		//print length of a string
		System.out.println(name.length());
		
		//print the whole string in lower case
		System.out.println(name.toLowerCase());
		
		//print the whole string in upper case
		System.out.println(name.toUpperCase());
		
		//trim white space from the string - it will trim the white space from left and right side of string
		System.out.println(name.trim());
		
		//print a substring starting index with 5
		System.out.println(name.substring(5));
		
		//print a substring starting with index 5 and ending with 10 
		//note - starting index is included in substring method but ending index is excluded. so, it will give value upto 9th index
		System.out.println(name.substring(5, 10));
		
		//replace char L with Z
		System.out.println(name.replace('L', 'Z'));
		
		//replace "ee" with "i"
		System.out.println(name.replace("ee", "i"));
		
		//check string strats with P
		System.out.println(name.startsWith("P"));
		
		//check string ends with n
		System.out.println(name.endsWith("n"));
		
		//check char at index 5
		System.out.println(name.charAt(5));
		
		//what is index of a in the string 
		System.out.println(name.indexOf('a')); //-> it give the index of first char 
		System.out.println(name.indexOf("an")); //-> it give the index of next same char
		
		//what is index value of a and start from the index 10
		System.out.println(name.indexOf('a', 10));
		
		//find index of z in the string
		System.out.println(name.indexOf('z')); //-> if char is not present in the string then it will return -1 value
		
		//find the index of from last 
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.lastIndexOf('a', 10));
		
		//find string is equal to Pardeep
		System.out.println(name.equals("Pardee"));
		System.out.println(name.equalsIgnoreCase("mr. pardeep lohan"));
		
		//print all the chars of string
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		//print the string in reverse
		String rev = "";
		for( int i = name.length() - 1; i >= 0 ; i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);//String is imuteable so no reverse function
		StringBuffer buff = new StringBuffer(name); //StringBuffer is mutable so it has reverse function
		System.out.println(buff.reverse());
		
		//replace first e with 1 and 2nd e with 2 and so on...
		String text = "Textboxer Beer";
		int n = 1;
		System.out.println(n);
		for(int i = 0; i < text.length(); i++){
			
			if(text.charAt(i)=='e')
			{
				text = text.replaceFirst("e",String.valueOf(n)) ;
				n++;
			}
			
		}
		
		System.out.println(text);
		
		//Remove junk char from a string
		//here we use regular expression [^a-zA-Z0-9]
		String s = "%#%^Iam$$%$@Lohan 0$#@$7";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		//reverse of a integer
		int num = 94768;
		int rev1 = 0;
		while(num!=0) {
			rev1 = rev1*10 + num%10;
			num = num/10;
			
		}
		System.out.println(rev1);
		

	}

}
