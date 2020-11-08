//Written by P.T.K.Trung (tg_phamthaikytrung@tdtu.edu.vn)
public class RecursiveBai1 {
    //1) If x is less than y, swap the two variables value
    //2) Recursively find y times the sum of x
    //3) If any of them become zero, return 0
    //x=5, y=3 -> output 15
    public static double prod_recur(int a,int b){
        if(a<b)
            return prod_recur(b, a);
        else if(b!=0)
            return (a + prod_recur(a, b-1)); //b time of a
        else
            return 0;
    }   
    //Implement function public int bin2dec(int n, int exp) to convert a binary number (in decimal number form) to decimal number using recursion. 
    //Ex: Given n = 1000,bin2dec(n, 0) = 8
    public static int bin2dec(int n, int exp){
        if(n==0)
            return 0;
        if(n==1)
            return (int)Math.pow(2, exp);
        return n % 10 * (int)Math.pow(2, exp) + bin2dec(n / 10, exp + 1);
    }
    //Implement function public int maxDigit(int n) to find the largest digit in a positive integer n using recursion.
    public static int maxDigit(int n) {
        n = Math.abs(n);   // make sure n is positive
        if (n > 0) {
            int digit = n % 10;
            int max = maxDigit(n / 10);
            return Math.max(digit, max);
        } else {
            return 0;
        } 
    }
    //Implement function public int maxElement(int a[], int n) to find the largest element in an array a using recursion.
    public static int maxElement(int[] a, int n) {
        if(n==1)
            return a[0];
        else
            return Math.max(a[n-1],maxElement(a, n-1)); //replace max with min if find smallest
    }
    //Implement function public int search(int a[], int n, int key) to find the position of the key in an array a, if key is not in the array, return -1, using recursion.
    public static int search(int[] a, int n, int key) 
     { 
        if(n==0)
            return -1;
        if(a[n-1]==key)
            return n;
        return search(a, n-1, key);
     } 
    public static void main(String[] args) {
        int[] arr={5,7,8,9,1,2,3};
        //System.out.println("Product of a & b: " +prod_recur(5,3));
        //System.out.println(bin2dec(1000, 0));
        //System.out.println(maxDigit(3987456));
        //System.out.println(maxElement(arr,arr.length));
        System.out.println(search(arr,arr.length,9));
    }
}
