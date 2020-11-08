import java.util.*;

class testdrive{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter 1st fraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        testI f1 = new test(a,b);

        System.out.println("enter 2nd fraction: ");
        a = sc.nextInt();
        b = sc.nextInt();
        testI f2 = new test(a,b);
        

        System.out.print("First fraction is: " + f1.getNumer());
        System.out.print("Second fraction is: " + f2);
    }

}