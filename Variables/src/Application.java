
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc = 10;
int xyz = 20;
int sum = abc+xyz;
System.out.println("sum should be = "+ sum);

////euqals
//	String str01 = "java is an awasome";
//	String str02 = "java is an awasome";
//	System.out.println("Is satetement true="+str01.equals(str02));
//	System.out.println("is it containing word"+str01.contains("java"));
//	
//	//Arrays
//	int[] num = new int [5];
//	num[0] = 10;
//	num[2] = 20;
//	
//	System.out.println("Print the value"+ num[0]);
//	System.out.println("Print the value"+ num[1]);
//	System.out.println("Print the value"+ num[2]);
//	System.out.println("Print the value"+ num[4]);
//	
//	//numeric data types
//
//		byte my_byte = 120;
//		short my_short = 20000;
//		int my_int = 333333333;
//		long my_long = 7777777;
//		
//		boolean my_boolean = true;
//		
//		char my_char = '4';
//		float my_float = 1.33f;
//		double my_double = 23.8999;
//		
//		// operation on integer
//		
//		int num1 = 10;
//		int num2 = 30;
//		sum = num1 + num2;
//		System.out.println("Addition="+ sum);
//		
//		// operation on interger multiplication
//		
//		int one = 5;
//		int two = 10;
//		
//		int mul = one * two;
//		System.out.println("multiplication = "+ mul);
//		System.out.println("value of num1 = "+one);
//		
//		// assgign value to other number
//		one = two;
//		System.out.println("value of num1 = "+ one);
		
		// type casting _ implicite
		
		int x = 10;
		long y = x ;
		System.out.println("Value should be = "+ y);
				
	// type casting_explicite
		
		double p = 10.35;
		int q = (int)p;
		System.out.println("value of Q should be = "+q);
		
		//String methods _Uppercase and lowercase
		
		String a = "I started learning Java";
		String result = a.toUpperCase();
		System.out.println("Result should be in uppercase ="+ result);
		
		// lowercase
		String Q = "I am board";
		String answer = Q.toLowerCase();
		System.out.println("result should be in lowercase="+answer);
		
		//substring
		
		// trim()
		
		String t = "                   I am enjoying my Java Tutorials  ";
		System.out.println(t.trim());
		
		//concat()
		
		String  b = "I like Java";
		System.out.println(b.concat(Q));
		
		//trim()
		
		String johny = "  I Love London  ";
		System.out.println(johny);
		System.out.println(johny.trim());
		
		//concat()
		String fish = " I wish I would have learned java much before";
		System.out.println(fish.concat(johny));
		
		//replac()
		
		System.out.println(fish.replace("would", "could"));
		
		//equals()
		String home = "I love Mumbai";
		String home1 = "I love Mumbai";
		System.out.println(home.equals(home1));
		
		//contains()
		System.out.println(home.contains("love"));
	}
		
}
