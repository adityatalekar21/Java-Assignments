package exceptionsdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			int a =23;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException ganja) {
			System.out.println("Divide by Zero");
		}	catch (Exception e) {
			System.out.println("first cast");
		}
		finally {
			System.out.println("Hello");
		}
	}

}
