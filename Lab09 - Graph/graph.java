import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Arrays;

public class graph{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));

        int n = sc.nextInt();
        int [][]arr = new int [n+2][n+2];
        for(int i = 1; i<=n;++i)
            for (int j = 1; j<=n;++j)
                arr[i][j] = sc.nextInt();

        System.out.println(n);
        for(int i = 1; i<=n;++i){
            for (int j = 1; j<=n;++j)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}