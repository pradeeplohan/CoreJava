
public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data type and variables
		int myNum = 5;
		String myNam = "Pardeep Lohan";
		char letter = 'P';
		double dec =5.99;
		boolean myVal = true;
		
		System.out.println(myNum + " This is my int data type");
		System.out.println(myNam + " This is my string data type");
		System.out.println(letter + " This is my char data type");
		System.out.println(dec + " This is my double data type");
		System.out.println(myVal + " This is my boolean data type");
		
		//Arrays - Store multiple values
		int[] arr1 = new int[5]; //Declaration of array
		arr1[0]=1; //assign the value
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		
		int[] arr2= {14,24,35,44,55,45,54,234,32,13};
		System.out.println(arr2[3]);
		
		//for loop arr1 = arr1.length - 5
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}

		//for loop arr2 = arr2.length - ?
		for(int i =0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name= {"MR.", "Pardeep", "Lohan"};
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		String[] empName= new String[5];
		empName[0] = "Pardeep Lohan";
		empName[1] = "Anuj Kumar";
		empName[2] = "Komal Verma";
		empName[3] = "Sahil Kumar";
		empName[4] = "Vansh Raj";
		//use enhanced for loop - for(variable with same data type : array variable)
		for(String s : empName)
		{
			System.out.println(s);
		}
	}

}
