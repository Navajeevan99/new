package multipack;

class Example {
	static void one() throws ArithmeticException {
	             System.out.println("Inside  method  one.");
	             int a=12/0;
                         System.out.println(a);
	 }
	public static void main(String[] args) throws ArithmeticException {
	one();
}
}