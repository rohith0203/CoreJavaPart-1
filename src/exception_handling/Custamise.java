package exception_handling;

public class Custamise {
public static void main(String[] args) {
	try
	{
		throw new MyCustomException();
	}
	catch(MyCustomException e)
	{
		System.out.println("are you mad");
	}
}
	
	
	
	
}
