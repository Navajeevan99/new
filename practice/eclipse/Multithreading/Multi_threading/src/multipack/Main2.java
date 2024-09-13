package multipack;
class mov extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1500);
				System.out.println("LEO ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	
}
class n1 extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++)
		{
			System.out.println("Bloody sweet");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				mov m=new mov();
				n1 n=new n1();
				m.start();
				n.start();
	}

}
