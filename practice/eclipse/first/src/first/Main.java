package first;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		if (age>=18)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		
		
	}

}
