package String_pack;
import java.lang.String;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss1=" Bloody Sweet";
		
		System.out.println(ss1.replace('e', 'a'));
		System.out.println(ss1.replace("Sweet","Salt"));
		System.out.println(ss1.replaceAll("e", "a"));
		System.out.println(ss1.replaceAll("Sweet", "Salt"));
		String ss2="Now , Vijay is called Thalapathy Vijay";	
		System.out.println(ss2.replaceFirst("Vijay","Ajith"));
		System.out.println(ss2.replaceFirst("V","A"));
	}

}
