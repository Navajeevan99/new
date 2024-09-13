import java.util.Scanner;
public class Main{
	public static void main()
	{
		Scanner r=new Scanner(System.in);
		int n;
		double t=0;
		n=r.nextInt();
		double[] m=new double[n+1];
		double a=r.nextDouble();
		
		for(int i=0;i<=n;i++)
			{
				m[i]=r.nextDouble();
				if (m[i]==-1)
				{
					break;
				}
				t=t+m[i];
			}
	
	if (a>=t)
{
	System.out.println(a-t+" SHORT");
}
else{
	System.out.println("ENOUGH MONEY");
}
}}