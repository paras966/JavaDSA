import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    public static int multiply(int m, int n){
        if(n==1)
            return m;
        return m + multiply(m, n-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(multiply(m,n));
    }
}
