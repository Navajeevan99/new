package String_pack;
import java.lang.String;
public class comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sl1="Bloody Sweet";
		String sl2="Bloody Sweet";
		System.out.println(sl1.compareTo(sl2));//sl1=sl2 in number of string
		String sl3="Bloody Salt";
		System.out.println(sl1.compareTo(sl3));//sl1>sl2 in number of string
		String sl4="Bloody Sweet1";
		System.out.println(sl1.compareTo(sl4));//sl1<sl2 in number of string
		String sl5="Bloody Sweat";
		System.out.println(sl1.compareTo(sl5));
		String sl6="Bloody Swaat";
		System.out.println(sl1.compareTo(sl6));
		
	}

}
