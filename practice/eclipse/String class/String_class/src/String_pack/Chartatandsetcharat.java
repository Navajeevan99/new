package String_pack;
import java.lang.String;
public class Chartatandsetcharat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Bloody Sweet");
		System.out.println(s.charAt(2));
		s.setCharAt(2, 'e');
		System.out.println(s);
		//append
		StringBuffer s1=new StringBuffer("Bloody");
		String s2=" Sweet ";
		s1.append(s2);
		System.out.println(s1);
		s1.append('V').append("IJAY");
		System.out.println(s1);
		s1.insert(13, "Told By ");
		System.out.println(s1);
		s1.insert(13, "y");
		System.out.println(s1);
		s1.insert(26, "y");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.delete(0,7);
		System.out.println(s1);
		s1.deleteCharAt(0);
		System.out.println(s1);
		s1.replace(0,1,"v");
		System.out.println(s1);
		s1.replace(5,10,"Told");
		System.out.println(s1);
		System.out.println(s1.substring(2,5));
		String s3=s1.substring(2,6);
		System.out.println(s3);
		StringBuffer s4=new StringBuffer("red is red in blue is blue");
		int i=s4.indexOf("red");
		System.out.println(i);
		int j=s4.lastIndexOf("red");
		System.out.println(j);
		StringBuffer sb = new StringBuffer("red is red in blue is blue");
	    int start = 11;
	    int end = 18;
	    char[] buf = new char[8];
	    sb.getChars(start, end, buf, 0);
	    System.out.println(buf); 
	    
	}

}
