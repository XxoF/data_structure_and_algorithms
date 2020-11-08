//written by P.T.K.TRUNG - (tg_phamthaikytrung@tdtu.edu.vn)
public class RecursiveBai2 {
    //exer 2a- recursive
	public static int rExer2a(int n){
		if(n==1)
			return 2;
		else
			return 2+ 2*rExer2a(n-1);
    }
    //exer 2a- iterative
    public static int Exer2a(int n){
        int result=0;
        for(int i=1;i<=n;i++)
            result+=Math.pow(2,i);
        return result;
    }
    //exer 2b - recursive
    public static double rExer2b(int x){
        if(x==0)
            return 1.0/2;
        else
            return (float) (x+1)/2 + rExer2b(x-1);
    }
    //exer 2b - iterative
    public static double Exer2b(int x){
        double result=0;
        for(int i=0;i<=x;i++)
            result+=(float) (i+1)/2;
        return result;
    }
    //exer 2c - recursive, noted that i!/(i-1)! = i -> Sum from 1 to n of i!/(i-1)! equal to S=1+2+3+..+n
    //or SumOf(i!/(i-1)!=(i-1)!*i/(i-1)!)=SumOf(i)
    public static double rExer2c(int n){
        if(n==1)
            return 1;
        else 
            return  n + rExer2c(n-1);
    }
    //Exer 2c: You can define a Factorial then make use of it to implement exer2c
    public static long rFact(int n){
        if(n==1||n==0)
            return n;
        else
            return n*rFact(n-1);
    }
    public static double rExer2c_use_Fact(int n){
        if (n==1)
            return 1;
        else    
            return (double)rFact(n)/rFact(n-1) + rExer2c_use_Fact(n-1);
    }
    //Exer2d. Sum (x:1->n) : x*(x-1) : Recursive
    public static long rExer2d(int x){
        if(x==1)
            return 0;
        else    
            return x*(x-1) + rExer2d(x-1);
    }
    //Exer2d. Sum (x:1->n) : x*(x-1) : Iterative
    public static long Exer2d(int x){
        long result=0;
        for(int i=1;i<=x;i++)
            result+=i*(i-1);
        return result;
    }
    //Exer2e: H(x) (x=1->n)=1^1.2^2.3^3.4^4....(n-1)^n-1.n^m : Recursive
    public static int powLoop(int base, int power) {
		int result;
		if (power == 0)
			result = 1;
		else {
			result = base;
			for (int j = 2; j <= power; j++)
				result = result * base;
		}
		return result;
	}
    public static long rExer2e(int n){
        if(n==1)
            return 1;
        else
            return powLoop(n, n) * rExer2e(n-1);
    }
    //Exer2e: H(x)(x=1->n)=1^1.2^2.3^3.4^4....(n-1)^n-1.n^m : Iterative
    public static long Exer2e(int n){
        long result=1;
        for(int i=1;i<=n;i++)
            result*=Math.pow(i,i);
        return result;
    }
	public static void main(String[] args) {
        //System.out.println("Exer1- recursive: " + rExer2a(4) + "   Iterative: " + Exer2a(4));
        //System.out.println("2b-recursive: " + rExer2b(3) + "   2b-iterative: " + Exer2b(3));
        //System.out.println("2c-recursive: " + rExer2c(3) + "   . Exer2c-recursive use Fact: " + rExer2c_use_Fact(3));
        //System.out.println("2d-recursive: "+rExer2d(3) + "    2d-iterative: " + Exer2d(3));
        System.out.println("2e-recursive: "+rExer2e(3) + " 2e-iterative: " + Exer2e(3));
	}
}