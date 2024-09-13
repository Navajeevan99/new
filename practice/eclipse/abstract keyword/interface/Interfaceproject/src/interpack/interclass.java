package interpack;
import java.util.Scanner;
interface inter
{
	int a=5;
	void getinput();
	default void disp()
	{
		System.out.println("It is dispaly function");
	}
	
}
 class show implements inter
{
	 public void getinput()
	 {
		 System.out.println("It is getinput function");
	 }
	
}
abstract class show1 implements inter
{
	abstract void nqew();
	
	public void getinput()
	 {
		 System.out.println("It is getinput function");
	 }
	
	
	void details()
	{
		System.out.println("It is details fucntion");
	}
	}
class show2 extends show1
{
	void nqew()
	{
		System.out.println("It is nqew function");
	}
}


public class interclass {

	public static void main(String[] args) {
		// TODO Auto-fgenerated method stub
		inter f=new show();
		f.getinput();
		f.disp();
		show f1=new show();
		f1.getinput();
		f1.disp();
		show1 n=new show2();
		n.details();
		show2 n1=new show2();
		n1.details();
		n1.disp();
	}

}
