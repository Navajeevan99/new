package String_pack;
import java.lang.String;
public class typeofcreatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ben10";//literals
		String s1=new String("Vijay");//Class
		char[] ch= {'T','h','a','l','a'};
		String s2=new String(ch);
		byte[] b= {72,109,75,106,65};
		String s3=new String(b);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
