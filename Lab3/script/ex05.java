import java.util.*;
public class ex05{

    public static String Dec2Bin(int n){
        if (n == 0) return "";
        String s = (n%2==0) ? "0" : "1";
        return Dec2Bin(n / 2) + s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println(Dec2Bin(n));
    }
}