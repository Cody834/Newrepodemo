package program.jav.demos;

public class ImplicitTypecasting {
	public static void main(String args[]) {
		//byte range -128 to 127 
		byte a=10; // you can fit byte into short because byte is 1 and short is 2 memory size
		short b=a;
		System.out.println(a);
		System.out.println(b);
	}

}
