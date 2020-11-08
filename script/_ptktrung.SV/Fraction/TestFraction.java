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

		if (f1.equals(f2)) 
			System.out.println("The fractions are the same.");
		else
			System.out.println("The fractions are not the same.");

		FractionI sum = f1.add(f2);
		System.out.println("Sum is " + sum);

		FractionI diff = f1.minus(f2);
		System.out.println("Difference is " + diff);

		FractionI prod = f1.times(f2);
		System.out.println("Product is " + prod);
	}
} 

