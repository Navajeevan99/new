package Ennum_pack;
enum day
{
	Sunday("a"),Monday("b"),Tuesday("c"),Wednesday("d"),Thursday("e"),Friday("e"),Saturday("f");
	String ab;
	day(String b)
	{
		ab=b;
	}
	String getab()
	{
		return ab;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day d=day.Monday;
		System.out.println("The value of day"+d);
		System.out.println("The position of "+d+d.ordinal());
		System.out.println(d.getab());
	}

}
