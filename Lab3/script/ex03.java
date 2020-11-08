public class ex03{

    public static boolean checkPrime(int n, int d){
        if (d == 1) 
            return true;
        if (n % d == 0)
            return false;

        return checkPrime(n,d-1);
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(5,4));
    }
}