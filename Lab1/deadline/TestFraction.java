// To test out Fraction class
import java.util.*;

public class TestFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st fraction: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		FractionI f1 = new Fraction(a, b);

		System.out.print("Enter 2nd fraction: ");
		a = sc.nextInt();
		b = sc.nextInt();
		FractionI f2 = new Fraction(a, b);

		System.out.println("1st fraction is " + f1);
		System.out.println("2nd fraction is " + f2);

		System.out.println(f1.getData());
	}
} 

