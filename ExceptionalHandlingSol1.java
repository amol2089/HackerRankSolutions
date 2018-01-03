package hackerSolutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandlingSol1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(scanner.nextInt()/scanner.nextInt());
		} catch (ArithmeticException aex) {
			System.out.println(aex);
		} catch (InputMismatchException imex) {
			System.out.println(imex.getClass().getName());
		}
	}
}
