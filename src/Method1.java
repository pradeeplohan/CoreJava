
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method1 obj = new Method1();
		obj.getData();
		getData1();
		
		String s=obj.getData2();
		System.out.println(s);
		
		//Access method outside the class
		Method2 obj2=new Method2();	
		obj2.getData();

		
	}
	
	public void getData()
	{
		System.out.println("This is a method present in class");
	}
	
	public static void getData1()
	{
		System.out.println("This is a method present in class with static keyword");
		//Don't need create a object for static method 
		//now we use it as class level not object level
	}
	
	public String getData2()
	{
		System.out.println("This method return a string.");
		return "Pardeep";
	}
	
	
}
