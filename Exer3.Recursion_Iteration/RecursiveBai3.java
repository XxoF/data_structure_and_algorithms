//written by P.T.K.Trung (tg_phamthaikytrung@tdtu.edu.vn)
public class RecursiveBai3{
   //Exercise 2 a - recursive An=2-1/2*A(n-1)
   public static double rAa(int n){
      if(n==0)
         return 2;
      else
         return 2-0.5*rAa(n-1);
   } 
   //Exercise 2 a- iterative An=2-1/2*A(n-1)
   public static double Aa(int n){
      double result=0;
      for(int i=0;i<=n;i++)
         result=2-result/2;   
      return result;   
   }
   //Exercise 2 b - recursive
   public static double rAb(int n){
      if(n<10)
         return 1;
      else
         return 1+rAb(n/10);
   }
   //Exercise 2 a - iterative
   public static double Ab(int n){
      double result=1;
      while(n>=10){
          result+=1; 
          n=n/10;
      }
      return result;
   }
   //A(n,k)=n+A(n,k-1) - recursive
   public static int rAc(int n, int k) {
       if(k==1)
            return n;
       else 
            return n + rAc(n,k-1);
   }
   //A(n,k)=n+A(n,k-1) - iterative
   public static int Ac(int n, int k){
      int result=0;
      for(int i=1;i<=k;i++)
         result+=n;
      return result;
   }
   //Fibonaci recursive
   public static long rFib(long n) {
        if ((n == 0) || (n == 1))
           return n;
        else
           return rFib(n - 1) + rFib(n - 2);
     }
   //Fibonaci iterative
   public static long Fib(long n){
      if (n <= 2)
		   return 1;
	   else {
		   int prev1=1, prev2=1, curr=0;
		   for (int i=3; i<=n; i++) {
			   curr = prev1 + prev2;
			   prev2 = prev1;
			   prev1 = curr;
         }
         return curr;
      }
   }  
     public static void main(String[] args) {
         System.out.println("Exercise 1a-recursive: " +rAa(5) + "   Exercise 1a- iterative: " + Aa(5));
         //System.out.println("A=1+A(n/10) recursive is: " + rAb(100) + " iterative is: " + Ab(100) );
         //System.out.println("A=n+A(n,k-1) recursive is " + rAc(5,3) + " iterative is: " + Ac(5,3));
         //System.out.println("The fibonacci - recursive is: " + rFib(3) + " iterative is " + Fib(3));
     }
}