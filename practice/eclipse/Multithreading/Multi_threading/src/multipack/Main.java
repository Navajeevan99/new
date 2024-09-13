package multipack;
class movie
{
	public void mov() throws InterruptedException
	{
		for (int i=0;i<5;i++)
		{
			Thread.sleep(1500);
			System.out.println("LEO");
			
		}
		
	}
	
}

public class Main {
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
		movie m=new movie();
		m.mov();
		
	
	}

}
