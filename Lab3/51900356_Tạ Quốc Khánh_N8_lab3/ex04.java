import java.util.*;
public class ex04{

  public static long a(int n){
    if(n == 1)
      return 3;
    return (n*2+1) + a(n-1);
  }

  public static long Fractorial(int n){
    if (n==1)
      return 1;
    return n*Fractorial(n-1);
  }
  public static long b(int n){
    if (n==1)
      return 1;
    return Fractorial(n) + b(n-1);
  }

  public static long c(int n){
    return (n==1)?1:Fractorial(n)*c(n-1);
  }

  public static long d(int n, int k){
    if (k == 0 || k > n) return 1;

    return (n - k + 1) * d(n,k-1);

  }

  public static long e(int n){
    if (n == 1) return 3;
    return (long) Math.pow(2,n) + (long) n*n + e(n-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = sc.nextInt();

    System.out.println("A = " + a(n));
    System.out.println("B = " + b(n));
    System.out.println("C = " + c(n));
    System.out.println("D = " + d(n,n));
    System.out.println("E = " + e(n));
  }
}
