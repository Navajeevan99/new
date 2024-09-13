package interpack;
interface var1
{
	int a=10;
	void disp();
}
class clvar implements var1
{
	public void disp()
	{
		System.out.println("Ben10"+a);
	}
	
}

public class intervar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var1 n=new clvar();
		n.disp();
		
	}

}
