import java.util.*;
public class ex06{

    public static int maxElement(int []a, int n){
        int ans = a[0];
        for(int x : a){
            ans = (ans > x) ? ans : x;
        }
        return ans;
    }

    public static int minElement(int []a, int n){
        int ans = a[0];
        for(int x : a){
            ans = (ans < x) ? ans : x;
        }
        return ans;
    }

    public static int evenElement(int []a, int n){
        int ans = 0;
        for(int x : a){
            ans += (x % 2 != 0) ? 1 : 0;
        }
        return ans;
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