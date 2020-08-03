//Documentation section
//This is my first basic Java Program

package test;

public class Basic {
	// Create a method always before main
	public int multiply(int a, int b, int c){
		int result = a * b * c;
		return result;
	}
	public static void main (String [] args) {
		//This is a basic program
	//declaration block	
		int a = 1, b, c; //Variables declaration
		b = 2; c = 3; //Initialization
		
		final int total = 10;// Constant declaration
		
		System.out.println("Addition of a and b is " + (a + b));//Addition of a and b is a + b
		System.out.println(total);
		System.out.println(c*3);
		
		//condition block
		if (a > b) {
			System.out.println("a is a bigger number");
		}
		else {
			System.out.println("b is bigger number");
		}
		// Loop block
		 for (int d=1; d <=10; d++) {
			System.out.println(d);
}
 //Create and access methods
Basic obj = new Basic();
int x = obj.multiply(a, b, c);
System.out.println(x);
		 
	}
}

