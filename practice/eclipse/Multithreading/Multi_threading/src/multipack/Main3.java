
package multipack;
class mov1 extends Thread
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
class n2 extends Thread
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

public class Main3 {

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
				mov1 m=new mov1();
				
				n2 n=new n2();
				m.start();
				
				n.start();
				try {
					m.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Bye");
	}

}
