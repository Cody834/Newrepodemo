package program.jav.demos;

public class ImplicitTypeCasting2 {
	public static void main (String args[]) {
		int a =10;
		float b = a;
   System.out.println(a);
   System.out.println(b);
   float c = (float) 10.10;  // Total of 8 bytes so in order to store 
 
   int d = (int)c;
   System.out.println(c);
   System.out.println(d);
   
	}

}
