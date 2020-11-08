import java.util.*;
public class ex07{

    public static int maxElement(int []a, int n){
        if (n == 1) return a[0];
        int max = maxElement(a,n-1);
        return (a[n-1] > max) ? a[n-1] : max;
    }

    public static int minElement(int []a, int n){
        if (n == 1) return a[0];
        int min = minElement(a,n-1);
        return (a[n-1] < min) ? a[n-1] : min;
    }

    public static int evenElement(int []a, int n){
        if (n == 0) return 0;
        int ans = (a[n-1] % 2 == 0) ? 0 : 1;
        return evenElement(a,n-1) + ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number element in array: ");
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n;++i){
            System.out.println("Enter the " + i+1 + " element: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Max element in array is: " + maxElement(a,n));
        System.out.println("Min element in array is: " + minElement(a,n));
        System.out.println("Number even element in array is: " + evenElement(a,n));
    }

}