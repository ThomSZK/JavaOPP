package excecoesCatches;

class Catches{
 
	public static void main(String[] args) {

	try {
		int a = args.length;
		System.out.println("a = "+a);
		int b = 42/a;
		int c[] = {1};
		c[42] = 99;
		
	} catch (ArithmeticException e) {
		System.out.println("Divide por 0: " +e);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index oob: "+e);
	} finally {
		System.out.println("Leaving a try ...");
	}
	System.out.println("Depois dos blocos try/catch.");
	
	}
}
