package exception_handlingpack;

public class Main {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		try
		{
			int arr[]=null;
			System.out.print(arr[1]);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ERrro accured");
		}
		finally
		{
			System.out.println("ben10");
		}
		
	}

}
