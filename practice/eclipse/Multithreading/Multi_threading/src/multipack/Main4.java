
package multipack;
class mov2 implements Runnable
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
class n3 extends Thread
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

public class Main4 {

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
				mov2 m=new mov2();
				n3 n=new n3();
				Thread t=new Thread(m);
				t.start();
				n.start();
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Bye");
	}

}
