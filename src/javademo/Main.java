package javademo;

public class Main {
	public static void main(String args[]) {
		try {
			int y = 10 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("AE - {}" + ae.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
